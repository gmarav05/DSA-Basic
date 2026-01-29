package numbers;
public class sumOfDigits {
    public static void main(String[] args) {
        int num = 352;

        int sum = 0;

        while(num !=0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println(sum);

        
    }
}
