// Java Program to Find Greatest of Two Numbers

import java.util.Scanner;

public class _5_GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println(Solution(n1, n2));
    }

    static int Solution(int n1, int n2) {
        if (n1 > n2)
            return n1;
        return n2;
    }
}
