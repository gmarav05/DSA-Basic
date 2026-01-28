
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if ( a % 2 == 0) {
            System.out.println(a + " is a even number.");
        } else {
            System.out.println(a + " is a odd number.");
        }
    }
}
