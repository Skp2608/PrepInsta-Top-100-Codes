// Power of a number using Java

import java.util.Scanner;

public class _16_PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        System.out.println("Power of given number is " + Solution(n, p));
    }

    static long Solution(int n, int p) {
        if (p == 1)
            return n;
        return n * Solution(n, p - 1);
    }
}
