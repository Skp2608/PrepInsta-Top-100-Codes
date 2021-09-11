// Automorphic number or not using Java

import java.util.Scanner;

public class _20_AutomorphicNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Solution(n));
    }

    static int Length(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;
    }

    static String Solution(int n) {
        int l = Length(n);
        int d = 1;
        for (int i = 1; i <= l; i++)
            d *= 10;
        if (n == (n * n) % d)
            return "Automorphic number";
        return "Not Automorphic number";
    }
}
