// Binary to octal conversion using Java

import java.util.Scanner;

public class _27_Binary2Octal {
    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Octal Number is " + Solution(n));
    }

    static int B2D(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 10;
            if (!(r == 1 || r == 0))
                return -1;
            else {
                ans += r * Math.pow(2, i);
                i++;
            }
            n /= 10;
        }
        return ans;
    }

    static int Solution(int N) {
        int ans = 0;
        int n = B2D(N);
        int i = 1;
        while (n > 0) {
            int r = n % 8;
            ans += r * i;
            i *= 10;
            n /= 8;
        }
        return ans;
    }
}
