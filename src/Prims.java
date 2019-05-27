public class Prims {
    int[][] cost = {
            {999, 3, 999, 999, 6, 5},
            {3, 999, 1, 999, 999, 4},
            {999, 1, 999, 6, 999, 4},
            {999, 999, 6, 999, 8, 5},
            {6, 999, 999, 8, 999, 2},
            {5, 4, 4, 5, 2, 999},

    };
    int n = cost.length;
    int src = 0;
    boolean[] visited = new boolean[n];

    void prims() {
        int sum = 0;

        visited[src] = true;
        while (true) {
            int u = 0, v = 0, min = 999;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] != 0 && visited[i] && !visited[j] && cost[i][j] < min) {
                        min = cost[i][j];
                        u = i;
                        v = j;
                    }
                }
            }
            if (min == 999) break;

            visited[v] = true;
            System.out.println("(" + u + ", " + v + ") = " + cost[u][v]);
            sum += cost[u][v];
        }

        System.out.println("min cost of tree is: " + sum);
    }

    public static void main(String[] args) {
        Prims obj = new Prims();
        obj.prims();
    }
}
