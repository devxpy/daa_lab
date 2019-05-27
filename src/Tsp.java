public class Tsp {
    static int[][] cost = new int[][]{
            {0, 6, 1, 3},
            {6, 0, 4, 3},
            {1, 4, 0, 2},
            {3, 3, 0, 2},
    };
    static int n = 4;
    static int inf = 999;

    static int tsp(int curNode, int[] tour) {
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

    public static void main(String[] args) {
        int[] tour = new int[n];
        for (int i = 0; i < n; i++) {
            tour[i] = i;
        }

        int minTour = tsp(0, tour);

        System.out.print("Min tour: " + minTour + "\nPath: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tour[i] + 1 + " -> ");
        }
        System.out.print(1 + " ");
    }
}
