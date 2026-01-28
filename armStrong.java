public class armStrong {
    public static void main(String[] args) {
        int num = 153;

        int original = num;

        int result = 0;

        int power = String.valueOf(num).length();

        while (num!=0) {
            int digit = num % 10;
            result += Math.pow(digit, power);
            num = num / 10;
        }

        System.out.println(original +  (result == original ? " is a armstrong number." : "Not an armstrong number."));
        
    }
}
