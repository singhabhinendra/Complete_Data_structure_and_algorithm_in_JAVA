import java.util.*;
public class DeleteDuplicatefoldersInSystem {
    class Node {
        Map<String, Node> subNodes = new TreeMap<>();
        String content = "";
        boolean remove = false;

        void markRemove() {
            if (remove) return;
            remove = true;
            for (Node value : subNodes.values()) {
                value.markRemove();
            }
        }
    }
    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        paths.sort(Comparator.comparingInt(List::size));
        List<Node> nodes = new ArrayList<>(paths.size());
        Node rootNode = new Node();
        for (List<String> pathList : paths) {
            Node current = rootNode;
            int last = pathList.size() - 1;
            for (int i = 0; i < last; i++) {
                String s = pathList.get(i);
                current = current.subNodes.get(s);
            }
            String name = pathList.get(last);
            Node node = new Node();
            current.subNodes.put(name, node);
            nodes.add(node);
        }
        StringBuilder content = new StringBuilder();
        Map<String, Node> nodeByContent = new HashMap<>();
        for (int i = nodes.size() - 1; i >= 0; i--) {
            Node node = nodes.get(i);
            if (node.subNodes.isEmpty()) continue;
            for (Map.Entry<String, Node> entry : node.subNodes.entrySet()) {
                content.append(entry.getKey())
                        .append('{')
                        .append(entry.getValue().content)
                        .append('}');
            }
            node.content = content.toString();
            content.setLength(0); // clear
            Node similar = nodeByContent.putIfAbsent(node.content, node);
            if (similar != null) {
                node.markRemove();
                similar.markRemove();
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < paths.size(); i++) {
            if (!nodes.get(i).remove) {
                ans.add(paths.get(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        DeleteDuplicatefoldersInSystem d = new DeleteDuplicatefoldersInSystem();

        List<List<String>> paths = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("c"),
                Arrays.asList("a", "b"),
                Arrays.asList("c", "b"),
                Arrays.asList("a", "b", "x"),
                Arrays.asList("c", "b", "x"),
                Arrays.asList("a", "b", "x", "y"),
                Arrays.asList("c", "b", "x", "y")
        );

        List<List<String>> result = d.deleteDuplicateFolder(paths);
        System.out.println("Remaining folders:");
        for (List<String> path : result) {
            System.out.println(path);
        }
    }
}
