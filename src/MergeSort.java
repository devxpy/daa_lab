import java.util.Random;

public class MergeSort {
    static int[] array = new int[100];

    static void merge(int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        int[] clone = array.clone();

        while (i <= mid && j <= high) {
            if (array[j] < array[i]) {
                clone[k] = array[j];
                j += 1;
            } else {
                clone[k] = array[i];
                i += 1;
            }
            k += 1;
        }

        while (i <= mid) {
            clone[k] = array[i];
            i += 1;
            k += 1;
        }

        while (j <= high) {
            clone[k] = array[j];
            j += 1;
            k += 1;
        }

        System.arraycopy(clone, 0, array, 0, array.length);
    }

    static void sort(int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = r.nextInt(100);
        }

        double start = System.nanoTime();
        sort(0, array.length - 1);
        double end = System.nanoTime();
        System.out.println(end - start);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
