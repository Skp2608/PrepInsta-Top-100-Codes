// Java Program to Check Whether a Number is Prime or Not

import java.util.Scanner;

public class _8_PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Solution(n));
    }

    static String Solution(int n) {
        if (n == 1)
            return "Not Prime";
        else if (n == 2)
            return "Prime";
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return "Not Prime";
            }
        }
        return "Prime";
    }
}
