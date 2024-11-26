public class DeleteAVertexInAdjacencyList {
    private static int v;
    private static AdjNode[] graph;

    public DeleteAVertexInAdjacencyList(int v) {
        graph = new AdjNode[v];
        for (int i = 0; i < v; i++) {
            graph[i] = null;
        }
    }

    public void addEdge(int source, int destination) {
        AdjNode node = new AdjNode(destination);
        node.next = graph[source];
        graph[source] = node;
    }

    // Function to delete a vertex
    public static void delVertex(int k) {
        // Iterate through all the vertices of the graph
        for (int i = 0; i < v; ++i) {
            AdjNode temp = graph[i];
            if (i == k) {
                graph[i] = temp.next;
                temp = graph[i];
            }
            // Delete the vertex using linked list concept
            while (temp != null) {
                if (temp.vertex == k) {
                    break;
                }
                AdjNode prev = temp;
                temp = temp.next;
                if (temp == null) {
                    continue;
                }
                prev.next = temp.next;
                temp = null;
            }
        }
    }

    public static void printGraph() {
        for (int i = 0; i < v; ++i) {
            System.out.print(i + " ");
            AdjNode temp = graph[i];
            while (temp != null) {
                System.out.print("->" + temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

    class Main2 {
        public static void main(String[] args) {
            int V = 6;
            DeleteAVertexInAdjacencyList graph = new DeleteAVertexInAdjacencyList(V);
            graph.addEdge(0, 1);
            graph.addEdge(0, 3);
            graph.addEdge(0, 4);
            graph.addEdge(1, 2);
            graph.addEdge(3, 2);
            graph.addEdge(4, 3);

            System.out.println("Intital adjacency list:");
            DeleteAVertexInAdjacencyList.printGraph();


            // Delete vertex
            DeleteAVertexInAdjacencyList.delVertex(4);
            System.out.println(
                    "Adjacency list after deleting vertex");
            graph.printGraph();

        }
    }

    class AdjNode1 {
        int vertex;
        AdjNode next;

        public AdjNode1(int data) {
            vertex = data;
            next = null;

        }
    }


