package num;

public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};

        Integer first = null, second = null;

        for (int num : nums) {
            if (first == null || num > first) {
                second = first;
                first = num;
            } else if ((second == null || num > second) && num != first) {
                second = num;
            }
        }

        System.out.println(second);

    }
}
