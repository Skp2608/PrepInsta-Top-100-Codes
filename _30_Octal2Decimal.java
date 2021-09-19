import java.util.Scanner;

public class _30_Octal2Decimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Decimal Number : " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            ans += (n%10)*Math.pow(8, i);
            i++;
            n /= 10;
        }
        return ans;
    }
}
