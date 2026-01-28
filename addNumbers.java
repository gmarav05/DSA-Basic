import java.util.Scanner;


public class addNumbers {
    public static void main(String[]args) {
        int  a, b, sum;
        Scanner mySn = new Scanner(System.in);
        System.out.println("Type a number: ");
        a = mySn.nextInt();
        System.out.println("Type another number: ");
        b = mySn.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        mySn.close();
    }
}