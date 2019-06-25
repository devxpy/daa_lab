package misc;

public class KnapsackDynamic {
    int[] profits = {0, 3, 45, 4, 3};
    int[] weights = {0, 1, 1, 1, 1};
    int capacity = 2;

    int[][] graph = new int[profits.length][profits.length];

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int run(int num, int remaining) {
        int result;


        if (num == 0 || remaining == 0) {
            result = 0;
        } else if (weights[num] > remaining) {
            result = run(num - 1, remaining);
        } else {
            result = max(
                    run(num - 1, remaining),
                    profits[num] + run(num - 1, remaining - weights[num])
            );
        }

        graph[num][remaining] = result;
        return result;
    }

    void print(int num, int remaining) {
        if (num >= 1 && remaining >= 1) {
            if (graph[num][remaining] != graph[num - 1][capacity]) {
                System.out.println("Item " + num + ": 1");
                print(num - 1, remaining - weights[num]);
            } else {
                System.out.println("Item " + num + ": 0");
                print(num - 1, remaining);
            }
        }
    }

    public static void main(String[] args) {
        KnapsackDynamic obj = new KnapsackDynamic();
        int n = obj.profits.length - 1;
        System.out.println("Total profit: " + obj.run(n, obj.capacity));
        obj.print(n, obj.capacity);
    }
}
