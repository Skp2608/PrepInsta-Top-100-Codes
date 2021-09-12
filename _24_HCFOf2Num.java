// Java Program to find GCD or HCF of two numbers
import java.util.Scanner;

public class _24_HCFOf2Num {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n2 > n1)
            System.out.print("HCF of 2 numbers is " + Solution(n1, n2));
        else
            System.out.print("HCF of 2 numbers is " + Solution(n2, n1));

    }

    static int Solution(int a, int b) {
        if (b % a == 0)
            return a;
        return Solution(b % a, a);
    }
}
