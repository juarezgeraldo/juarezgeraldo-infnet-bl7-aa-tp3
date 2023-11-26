import minimoheap.MinimoHeap;

import java.io.IOException;

//public class Application implements Comparable<Edge> {
public class Application {
    int u, v, weight;

    public void Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public static void main(String[] args) throws IOException {

// ***** PROBLEMA 01 *****
// =======================
        new MinimoHeap();


// ***** PROBLEMA 02 *****
// =======================
//        new Kruskal(5);

    }



//    private static void grafo() {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        Edge[] edges = new Edge[M];
//        for (int i = 0; i < M; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int r = sc.nextInt();
//            edges[i] = new Edge  (null, y, r);
//        }
//
//        // Sort the edges in ascending order of weight
//        Arrays.sort(edges);
//
//        int[] parent = new int[N + 1];
//        Arrays.fill(parent, -1);
//
//        int totalWeight = 0;
//        for (Edge edge : edges) {
//            int u = edge.u;
//            int v = edge.v;
//
//            int uRoot = findRoot(parent, u);
//            int vRoot = findRoot(parent, v);
//
//            if (uRoot != vRoot) {
//                parent[uRoot] = vRoot;
//                totalWeight += edge.weight;
//            }
//        }
//
//        System.out.println(totalWeight);
//        sc.close();
//    }
//
//    private static int findRoot(int[] parent, int node) {
//        if (parent[node] == -1) {
//            return node;
//        }
//        return findRoot(parent, parent[node]);
//    }



}



