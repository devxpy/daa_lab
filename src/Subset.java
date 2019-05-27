public class Subset {
    int[] set = {68, 636, 1, 747, 858, 8, 1};
    boolean[] taken = new boolean[set.length];
    int sum = 0, count = 0, target = 2;

    void subset() {
        subset(0, 0);
    }

    void subset(int sol, int index) {
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
        Subset obj = new Subset();
        for (int it : obj.set) {
            obj.sum += it;
        }
        obj.subset();
        if (obj.count == 0) {
            System.out.println("No Solution!");
        }
    }
}
