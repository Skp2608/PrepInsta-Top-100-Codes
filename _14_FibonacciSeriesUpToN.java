// Fibonacci series up to n using Java

import java.util.Scanner;

public class _14_FibonacciSeriesUpToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution(n);
    }

    static void Solution(int n) {
        int a = -1;
        int b = 1;
        int c;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + "  ");
            a = b;
            b = c;
        }
    }
}
