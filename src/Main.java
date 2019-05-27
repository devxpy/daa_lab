import java.util.Scanner;

public class Main {
//    static int[] distances = new int[20];
//    static int[] visited = new int[20];
//
//    public static int findmin() {
//        int i, n, min = 0;
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        for (i = 1; i <= n; i++) {
//            if (visited[i] == 0) {
//                min = i;
//                break;
//            }
//        }
//        for (i = 1; i <= n; i++) {
//            if (distances[i] < distances[min] && visited[i] == 0)
//                min = i;
//        }
//        return min;
//    }
//
//    public void dijkstra(int src, int[][] cost, int n) {
//        int[] previous = new int[20];
//        for (int i = 1; i <= n; i++) {
//            visited[i] = 0;
//            distances[i] = 999;
//            previous[i] = 0;
//        }
//        distances[src] = 0;
//        for (int i = 1; i <= n; i++) {
//            int min = findmin();
//            visited[min] = 1;
//            for (int other = 1; other <= n; other++) {
//                if (cost[min][other] != 999 && visited[other] == 0) {
//                    if (distances[other] > distances[min] + cost[min][other]) {
//                        distances[other] = distances[min] + cost[min][other];
//                        previous[other] = min;
//                    }
//                }
//            }
//        }
//        System.out.println("shortest path costs\n");
//        for (int i = 1; i <= n; i++) {
//            if (distances[i] == 999)
//                System.out.println("sorry!  no path for source" + src + "to" + i + "vertex");
//            else
//                System.out.println("path cost from" + src + "to" + i + "is:" + distances[i] + "\n");
//        }
//        System.out.println("shortest group of paths are\n");
//        for (int i = 1; i <= n; i++) {
//            if (i != src && distances[i] != 999) {
//                System.out.print(i);
//                int j = previous[i];
//                while (previous[j] != 0) {
//                    System.out.println("<----" + j + " ");
//                    j = previous[j];
//                }
//                System.out.println("<----" + src + "\n");
//            }
//        }
//    }
//
//    public static void main(String args[]) {
//        int i, j, n, v;
//        int w[][] = new int[50][50];
//        Dijikstra d1 = new Dijikstra();
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number of vertices\n");
//        n = in.nextInt();
//        System.out.println("enter the cost of vertices\n");
//        for (i = 1; i <= n; i++)
//            for (j = 1; j <= n; j++) {
//                w[i][j] = in.nextInt();
//            }
//        System.out.println("enter the source vertex\n");
//        v = in.nextInt();
//        /* call Dijkstra method */
//        d1.dijkstra(v, w, n);
//    }
}
