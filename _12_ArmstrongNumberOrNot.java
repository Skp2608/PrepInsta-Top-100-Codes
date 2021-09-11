// Armstrong number or not using Java
import java.util.Scanner;

public class _12_ArmstrongNumberOrNot {
    public static void main(String[] args) {
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
        int sum = 0;
        int ans = n;
        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, l);
            n /= 10;
        }
        if (ans == sum)
            return "Armstrong number";
        return "Not Armstrong number";
    }
}
