package num;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 98, 33, 27};
        
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
}
