public class Kruskal {
    int[][] cost = {
            {999, 3, 999, 999, 6, 5},
            {3, 999, 1, 999, 999, 4},
            {999, 1, 999, 6, 999, 4},
            {999, 999, 6, 999, 8, 5},
            {6, 999, 999, 8, 999, 2},
            {5, 4, 4, 5, 2, 999},
    };
    int n = cost.length;
    int[] parents = new int[n];


    void union(int i, int j) {
        if (i < j) {
            parents[i] = j;
        } else {
            parents[j] = i;
        }
    }

    int find_parent(int p) {
        while (parents[p] != -1) {
            p = parents[p];
        }
        return p;
    }

    Kruskal() {
        for (int i = 0; i < parents.length; i++) {
            parents[i] = -1;
        }
    }

    void kruskal() {
        int sum = 0;

        while (true) {
            int min = 999, u = 0, v = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] != 0 && cost[i][j] < min) {
                        min = cost[i][j];
                        u = i;
                        v = j;
                    }
                }
            }

            if (min == 999) break;

            int i = find_parent(u);
            int j = find_parent(v);

            if (i != j) {
                union(i, j);
                System.out.println("(" + u + ", " + v + ") = " + cost[u][v]);
                sum += min;
            }

            cost[u][v] = cost[v][u] = 999;
        }

        System.out.println("min cost of tree is: " + sum);
    }

    public static void main(String[] args) {
        Kruskal obj = new Kruskal();
        obj.kruskal();
    }
}
