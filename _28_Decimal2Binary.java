import java.util.Scanner;

public class _28_Decimal2Binary {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Binary number is " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        int i = 1;
        while (n > 0) {
            int r = n % 2;
            ans += r * i;
            i *= 10;
            n /= 2;
        }
        return ans;
    }
}
