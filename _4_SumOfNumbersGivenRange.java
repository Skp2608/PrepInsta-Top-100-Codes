// Program to find the sum of numbers in a given range in Java

import java.util.Scanner;

public class _4_SumOfNumbersGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("Sum of Numbers of Given Range : "+ Solution(n1, n2));
    }

    static int Solution(int n1, int n2) {
        int ans = 0;
        for (int i = n1; i <= n2; i++)
            ans += i;
        return ans;
    }
}
