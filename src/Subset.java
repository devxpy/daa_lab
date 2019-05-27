public class Subset {
    static int[] set = {1, 5, 7, 2};
    static boolean[] taken = new boolean[4];
    static int sum = 0, count = 0, target = 8;

    static void subset() {
        subset(0, 0);
    }

    static void subset(int sol, int index) {
        if (index >= set.length) return;

        int newIndex = index + 1;
        int newSol = sol + set[index];
        taken[index] = true;

        if (newSol == target) {
            count += 1;
            System.out.print("Solution " + count + ": ");
            for (int i = 0; i < taken.length; i++) {
                if (taken[i]) {
                    System.out.print(set[i] + " ");
                }
            }
            System.out.println();
        } else if (newSol < target) {
            subset(newSol, newIndex);
        }

        if (sum - set[index] >= target) {
            taken[index] = false;
            subset(sol, newIndex);
        }
    }

    public static void main(String[] args) {
        for (int it : set) {
            sum += it;
        }
        subset();
        if (count == 0) {
            System.out.println("No Solution!");
        }
    }
}
