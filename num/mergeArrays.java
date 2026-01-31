package num;

public class mergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};

        int merged[] = new int[a.length + b.length];
        int index = 0;
        for (int n : a) {
            merged[index++] = n;
        }

        for (int n : b) {
            merged[index++] = n;
        }

        for (int n : merged) {
            System.out.print(n + " ");
        }
    }
}
