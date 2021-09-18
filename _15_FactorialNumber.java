// Java Program to print Factorial of a number

import java.util.Scanner;

public class _15_FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Factorial of a number is " + Solution(n));
    }

    static int Solution(int n) {
        if (n == 1)
            return 1;
        return n * Solution(n - 1);
    }
}
