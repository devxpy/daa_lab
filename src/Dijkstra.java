public class Dijkstra {
    int inf = 999;
    int[][] cost = {
            {0, 7, 3, inf, inf},
            {7, 0, 1, 2, 6},
            {3, 1, 0, 2, inf},
            {inf, 2, 2, 0, 4},
            {inf, 6, inf, 4, 0},
    };
//    int[][] cost = {
//        {inf, 2, 3},
//        {2, inf, 4},
//        {3, 4, inf}
//    };
    int src = 0, n = cost.length;
    int[] prev, dist;
    boolean[] visited;

    Dijkstra() {
        prev = new int[n];
        dist = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            prev[i] = -1;
            dist[i] = inf;
            visited[i] = false;
        }
        dist[src] = 0;
    }

    int findNextMin() {
        int min = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                min = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && dist[i] < dist[min]) {
                min = i;
            }
        }

        return min;
    }


    void dijkstra() {
        while (true) {
            int cur = findNextMin();
            if (cur == -1) break;

            visited[cur] = true;

            for (int near = 0; near < n; near++) {
                if (visited[near] || cost[cur][near] == inf) continue;

                int newCost = dist[cur] + cost[cur][near];

                if (newCost < dist[near]) {
                    dist[near] = newCost;
                    prev[near] = cur;
                }
            }
        }
    }

    void print() {
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] != inf) {
                System.out.println("Path to " + (i + 1) + " costs: " + dist[i]);

                int p = prev[i];
                if (p == -1) continue;
                System.out.print(i + 1);
                while (prev[p] != -1) {
                    System.out.print(" <- " + (p + 1));
                    p = prev[p];
                }
                System.out.println(" <- " + (src + 1));
            } else {
                System.out.println("No path to " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Dijkstra obj = new Dijkstra();
        obj.dijkstra();
        obj.print();
    }
}
