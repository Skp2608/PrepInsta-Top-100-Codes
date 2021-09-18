// Program to Find the Sum of First N Natural Numbers using java

import java.util.Scanner;

public class _3_SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum of first N Natural Number : " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++)
            ans += i;
        return ans;
    }
}
