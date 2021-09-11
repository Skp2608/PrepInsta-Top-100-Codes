// Harshad number or not using Javas

import java.util.Scanner;

public class _21_HarshadNumberOrNot {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(Solution(n));
    }

    static String Solution(int n) {
        int sum = 0;
        int N = n;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        if (N % sum == 0)
            return "Harshad number";
        return "Not Harshad number";
    }
}
