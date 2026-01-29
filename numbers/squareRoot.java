package numbers;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        System.out.print("Enter a number to find its square root: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        System.out.println(Math.sqrt(a));
    }
}
