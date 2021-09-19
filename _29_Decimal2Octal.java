import java.util.Scanner;

public class _29_Decimal2Octal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Octal Number is "+Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        int i = 1;
        while (n > 0) {
            ans += i * (n % 8);
            i *= 10;
            n /= 8;
        }
        return ans;
    }
}
