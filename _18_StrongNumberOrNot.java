// Strong number or not using Java

import java.util.Scanner;

public class _18_StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Solution(n));
    }

    static int Factorial(int n) {
        if (n == 1)
            return 1;
        return n * Factorial(n - 1);
    }

    static String Solution(int n) {
        int ans = n;
        int sum = 0;
        while (n > 0) {
            sum += Factorial(n % 10);
            n /= 10;
        }
        if (ans == sum)
            return "Strong number";
        return "Not Strong number";
    }
}
