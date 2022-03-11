public class adjMatrix {
    private int V;
    private int E;
    private int adjacencyMatrix[][];
public adjMatrix(int V) {
    this.V = V;
    this.E=0;
    this.adjacencyMatrix = new int[V][V];
}
    public void addEdge(int u,int v){
        this.adjacencyMatrix[u][v]=1;
        this.adjacencyMatrix[v][u]=1;
        E++;
}
    public void printGraph() {
        System.out.println("Graph:Adjacency Matrix");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        adjMatrix obj=new adjMatrix(4);
        obj.printGraph();
        obj.addEdge(0,1);
        obj.addEdge(1,2);
        obj.addEdge(2,3);
        obj.addEdge(3,0);
obj.printGraph();
    }
}
