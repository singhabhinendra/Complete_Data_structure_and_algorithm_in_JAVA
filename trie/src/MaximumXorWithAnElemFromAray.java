import java.util.*;

class Node5 {
    Node5[] links = new Node5[2];

    public Node5() {}

    boolean containKey(int bit) {
        return (links[bit] != null);
    }

    Node5 get(int bit) {
        return links[bit];
    }

    void put(int bit, Node5 node) {
        links[bit] = node;
    }
}

class Trie2 {
    private Node5 root;

    Trie2() {
        root = new Node5();
    }

    public void insert(int num) {
        Node5 node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containKey(bit)) {
                node.put(bit, new Node5());
            }
            node = node.get(bit);
        }
    }

    public int getMax(int num) {
        Node5 node = root;
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

public class MaximumXorWithAnElemFromAray {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<>();
        int m = queries.size();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(queries.get(i).get(1));  // limit
            temp.add(queries.get(i).get(0));  // number to XOR
            temp.add(i);                      // index
            offlineQueries.add(temp);
        }

        Collections.sort(offlineQueries, (a, b) -> a.get(0).compareTo(b.get(0)));
        Collections.sort(arr);

        Trie2 trie = new Trie2();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(m, -1));

        int n = arr.size();
        int ind = 0;

        for (int i = 0; i < m; i++) {
            int limit = offlineQueries.get(i).get(0);
            int num = offlineQueries.get(i).get(1);
            int queryInd = offlineQueries.get(i).get(2);

            while (ind < n && arr.get(ind) <= limit) {
                trie.insert(arr.get(ind));
                ind++;
            }

            if (ind != 0) {
                ans.set(queryInd, trie.getMax(num));
            } else {
                ans.set(queryInd, -1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter arr elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter number of queries:");
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        System.out.println("Enter queries (num limit):");
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int limit = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(num);
            temp.add(limit);
            queries.add(temp);
        }

        ArrayList<Integer> result = maxXorQueries(arr, queries);

        System.out.println("Result:");
        for (int ans : result) {
            System.out.print(ans + " ");
        }
    }
}
