import java.util.Random;

public class QuickSort {
    static int[] array = new int[100];

    static int partition(int low, int high) {
        int i = low, j = high + 1, pivot = array[low];

        while (i < j) {
            do i++; while (i <= high && array[i] <= pivot);
            do j--; while (j >= low && array[j] > pivot);

            if (i < j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        array[low] = array[j];
        array[j] = pivot;

        return j;
    }

    static void qs(int low, int high) {
        if (low < high) {
            int mid = partition(low, high);
            qs(low, mid - 1);
            qs(mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = r.nextInt(100);
        }

        double start = System.nanoTime();
        qs(0, array.length - 1);
        double end = System.nanoTime();
        System.out.println(end - start);

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
