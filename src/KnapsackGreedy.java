public class KnapsackGreedy {
    int[] items = {2, 15, 24};
    int[] weights = {15, 10, 18};
    int[] profits = {24, 15, 25};
    int capacity = 20;

    int n = items.length;
    int[] ratios = new int[n];
    float[] result = new float[n];

    void swap(int i, int j) {
        for (int[] array : new int[][]{items, weights, profits, ratios}) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    void sort() {
        for (int i = 0; i < n; i++) {
            ratios[i] = profits[i] / weights[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = n + 1; j < n; j++) {
                if (ratios[i] <= ratios[j]) continue;
                swap(i, j);
            }
        }
    }

    float run() {
        float totalProfit = 0, totalWeight = 0;

        for (int i = 0; i < n; i++) {
            float newWeight = totalWeight + weights[i];

            if (newWeight >= capacity) {
                float remaining = capacity - totalWeight;
                float fraction = remaining / weights[i];
                result[i] = fraction;
                totalProfit += fraction * profits[i];
                break;
            }

            result[i] = 1;
            totalProfit += profits[i];
            totalWeight = newWeight;
        }

        return totalProfit;
    }

    void print(float profit) {
        System.out.println("Total profit: " + profit);
        for (int i = 0; i < n; i++) {
            System.out.println("Item " + items[i] + ": " + result[i]);
        }
    }

    public static void main(String[] args) {
        KnapsackGreedy obj = new KnapsackGreedy();
        obj.sort();
        obj.print(obj.run());
    }
}
