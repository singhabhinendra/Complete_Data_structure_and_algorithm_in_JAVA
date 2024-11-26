class AdjNode{
    int vertex;
    AdjNode next;
    public AdjNode(int data){
        vertex=data;
        next=null;
    }
}
public class AddingAVertexInAdjacencyList {
    private static int v;
    private static AdjNode[] graph;
    public AddingAVertexInAdjacencyList(int v){
        graph=new AdjNode[v];
        for(int i=0;i<v;i++){
            graph[i]=null;
        }
    }

    public void addEdge(int source,int destination){
        AdjNode node=new AdjNode(destination);
        node.next=graph[source];
        graph[source]=node;
    }

    public void addVertex( int vk,int source,int destination){
        addEdge(source, vk);
        addEdge(vk, destination);

    }

    public static void printGraph(){
        for(int i=0;i<v;++i){
            System.out.print(i+" ");
            AdjNode temp=graph[i];
        while(temp!=null){
            System.out.print("->" + temp.vertex+ " ");
            temp = temp.next;
        }
        System.out.println();
        }
    }
}
class Main1{
public static void main(String[] args) {
    int V = 6;
    AddingAVertexInAdjacencyList graph = new AddingAVertexInAdjacencyList(V);
    graph.addEdge(0, 1);
    graph.addEdge(0, 3);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(3, 2);
    graph.addEdge(4, 3);

    System.out.println("Intital adjacency list:");
    AddingAVertexInAdjacencyList.printGraph();

    graph.addVertex(5,3, 2);

    System.out.println("Adjacency list after adding vertex:");
    AddingAVertexInAdjacencyList.printGraph();

}
}