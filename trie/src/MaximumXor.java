import java.util.ArrayList;

class Node4 {
    Node4[] links = new Node4[2];
    public Node4() {}

    boolean containKey(int bit) {
        return (links[bit] != null);
    }

    Node4 get(int bit) {
        return links[bit];
    }

    void put(int bit, Node4 node) {
        links[bit] = node;
    }
}

class Trie1 {
    private Node4 root;

    Trie1() {
        root = new Node4();
    }

    public void insert(int num) {
        Node4 node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containKey(bit)) {
                node.put(bit, new Node4());
            }
            node = node.get(bit);
        }
    }

    public int getMax(int num) {
        Node4 node = root;
        int maxNum = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.containKey(1 - bit)) {
                maxNum |= (1 << i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}

public class MaximumXor {
    public static int maxXOR(int n, int m, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Trie1 trie = new Trie1();
        for (int i = 0; i < n; i++) {
            trie.insert(arr1.get(i));
        }
        int maxi = 0;
        for (int i = 0; i < m; i++) {
            maxi = Math.max(maxi, trie.getMax(arr2.get(i)));
        }
        return maxi;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(6);
        arr1.add(6);
        arr1.add(0);
        arr1.add(8);
        arr1.add(5);
        arr1.add(6);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(7);
        arr2.add(1);
        arr2.add(7);
        arr2.add(8);
        arr2.add(0);
        arr2.add(2);

        int result = maxXOR(arr1.size(), arr2.size(), arr1, arr2);
        System.out.println("Maximum XOR is: " + result);
    }
}
