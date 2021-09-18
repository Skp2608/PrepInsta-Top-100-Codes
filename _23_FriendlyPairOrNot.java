// Friendly pair or not (amicable or not) using Java

import java.util.Scanner;

public class _23_FriendlyPairOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println(Solution(n1, n2));
    }

    static int SumOfFactor(int n) {
        int ans = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                ans += i;
        }
        return ans;
    }

    static String Solution(int n1, int n2) {
        int sum1 = SumOfFactor(n1);
        int sum2 = SumOfFactor(n2);
        if (n1 == sum2 && n2 == sum1)
            return "Friendly Pair";
        return "Not Friendly Pair";
    }
}
