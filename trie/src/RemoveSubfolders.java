import java.util.*;

class Node6 {
    Map<String, Node6> children = new HashMap<>();
    boolean isEnd = false;
}

class Trie3 {
    Node6 root;

    Trie3() {
        root = new Node6();
    }

    boolean insert(String path) {
        String[] parts = path.split("/");
        Node6 node = root;
        for (String part : parts) {
            if (part.isEmpty()) continue;

            if (node.isEnd) {
                // A parent folder already exists — so this is a subfolder
                return false;
            }

            node.children.putIfAbsent(part, new Node6());
            node = node.children.get(part);
        }
        node.isEnd = true;
        return true;
    }
}

public class RemoveSubfolders {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        Trie3 trie = new Trie3();
        List<String> result = new ArrayList<>();

        for (String path : folder) {
            if (trie.insert(path)) {
                result.add(path);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveSubfolders rs = new RemoveSubfolders();

        String[] folder1 = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        System.out.println(rs.removeSubfolders(folder1)); // ["/a", "/c/d", "/c/f"]

        String[] folder2 = {"/a", "/a/b/c", "/a/b/d"};
        System.out.println(rs.removeSubfolders(folder2)); // ["/a"]

        String[] folder3 = {"/a/b/c", "/a/b/ca", "/a/b/d"};
        System.out.println(rs.removeSubfolders(folder3)); // ["/a/b/c", "/a/b/ca", "/a/b/d"]
    }
}
