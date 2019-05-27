public class Tsp {
    int[][] cost = new int[][]{
            {0, 6, 1, 3},
            {6, 0, 4, 3},
            {1, 4, 0, 2},
            {3, 3, 0, 2},
    };
    int n = 4;
    int inf = 999;

    int tsp(int curNode, int[] tour) {
        int minCost = inf;
        int[] minTour = tour.clone();

        if (curNode == n - 2) {
            return cost[tour[n - 2]][tour[n - 1]] + cost[tour[n - 1]][tour[0]];
        }

        int nextNode = curNode + 1;

        for (int i = nextNode; i < n; i++) {
            int[] temp = tour.clone();

            temp[nextNode] = tour[i];
            temp[i] = tour[nextNode];

            int newCost = cost[temp[curNode]][temp[nextNode]] + tsp(nextNode, temp);

            if (newCost < minCost) {
                minCost = newCost;
                minTour = temp;
            }
        }

        System.arraycopy(minTour, 0, tour, 0, n);

        return minCost;
    }

    void print(int[] tour, int cost) {
        System.out.print("Min tour: " + cost + "\nPath: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tour[i] + 1 + " -> ");
        }
        System.out.print(1 + " ");
    }

    public static void main(String[] args) {
        Tsp obj = new Tsp();

        int[] tour = new int[obj.n];
        for (int i = 0; i < obj.n; i++) {
            tour[i] = i;
        }

        int cost = obj.tsp(0, tour);
        obj.print(tour, cost);
    }
}
