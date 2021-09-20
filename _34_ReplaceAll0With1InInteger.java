import java.util.*;

public class _34_ReplaceAll0With1InInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Replace all 0’s with 1 in a given integer is " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        int i = 1;
        while (n > 0) {
            int r = n % 10;
            if (r == 0)
                r = 1;
            ans += i * r;
            i *= 10;
            n/=10;
        }
        return ans;
    }
}
