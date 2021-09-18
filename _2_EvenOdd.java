// Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class _2_EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution(n);
    }

    static void Solution(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
