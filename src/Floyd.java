public class Floyd {
    public static void main(String[] args) {
        int[][] cost = new int[][]{
                {0, 999, 3, 999},
                {2, 0, 999, 999},
                {999, 7, 0, 1},
                {6, 999, 999, 0},
        };
        int n = cost.length;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int newCost = cost[i][k] + cost[k][j];
                    if (newCost < cost[i][j]) {
                        cost[i][j] = newCost;
                    }
                }
            }
        }

        for (int[] i : cost) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
