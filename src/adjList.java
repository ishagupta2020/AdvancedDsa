import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class adjList {
    private int vertex;
    LinkedList<Integer> list[];

    public adjList(int vertex) {
        this.vertex = vertex;
        this.list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }

    }

    public void addEdge(int u, int v) {
        this.list[u].add(v);
        this.list[v].add(u);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
            }
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ");
            }
            System.out.println();

        }
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : list[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : list[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        adjList obj = new adjList(4);
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 0);
        obj.printGraph();
        obj.bfs(0);
        obj.dfs(0);
    }
}


