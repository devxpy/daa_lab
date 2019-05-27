public class Hamilton {
    int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0},
    };
    int n = graph.length;

    boolean isSafe(int[] path, int pos) {
        if (graph[path[pos - 1]][path[pos]] == 0) {
            return false;
        }
        for (int i = 0; i < pos; i++) {
            if (path[i] == path[pos]) {
                return false;
            }
        }
        return true;
    }

    boolean hamilton(int[] path, int pos) {
        if (pos >= n) {
            return graph[path[pos - 1]][path[0]] == 1;
        }
        for (int i = 0; i < n; i++) {
            path[pos] = i;
            if (isSafe(path, pos) && hamilton(path, pos + 1)) {
                return true;
            }
            path[pos] = -1;
        }
        return false;
    }

    void print(int[] path, boolean success) {
        if (!success) {
            System.out.println("Hamiltonian curve not found!");
            return;
        }
        System.out.print("Hamiltonian path is: ");
        for (int i : path) {
            System.out.print(i + " ");
        }
        System.out.println(path[0]);
        System.out.println();
    }

    public static void main(String[] args) {
        Hamilton obj = new Hamilton();
        int[] path = new int[obj.n];
        for (int i = 0; i < path.length; i++) {
            path[i] = -1;
        }
        path[0] = 1; // start index
        obj.print(path, obj.hamilton(path, 1));
    }
}
