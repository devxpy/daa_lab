//public class Main {
//    private static int w[] = new int[10];
//    private static int b[] = new int[10];
//    private static int v[][] = new int[10][10];
//    private static int value[] = new int[10];
//
//    static int max(int a, int b) {
//        return (a > b) ? a : b;
//    }
//
//    static int knap(int n, int capactiy) {
//        if (n == 0 || capactiy == 0) {
//            v[n][capactiy] = 0;
//        } else if (w[n] > capactiy) {
//            v[n][capactiy] = knap(n - 1, capactiy);
//        } else {
//            v[n][capactiy] = max(
//                    knap(n - 1, capactiy),
//                    value[n] + knap(n - 1, capactiy - w[n])
//            );
//        }
//        return v[n][capactiy];
//    }
//
//    static void optimal(int n, int capacity) {
//        if (n >= 1 || capacity >= 1) {
//            if (v[n][capacity] != v[n - 1][capacity]) {
//                System.out.println("Item:" + n);
//                b[n] = 1;
//                capacity = capacity - w[n];
//                optimal(n - 1, capacity);
//            } else {
//                optimal(n - 1, capacity);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int profit, w1, n, i, j;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of items:");
//        n = sc.nextInt();
//        System.out.println("enter the capacity of the knapsack:");
//        w1 = sc.nextInt();
//        System.out.println("enter the values:");
//        for (i = 1; i <= n; i++)
//            value[i] = sc.nextInt();
//        System.out.println("enter the weights:");
//        for (i = 1; i <= n; i++)
//            w[i] = sc.nextInt();
//        profit = knap(n, w1);
//        System.out.println("profit: " + profit);
//        System.out.println("\noptimal subset is:\n");
//        optimal(n, w1);
//        System.out.println("the solution vector is:");
//        for (i = 1; i <= n; i++)
//            System.out.println(b[i]);
//    }
//}
