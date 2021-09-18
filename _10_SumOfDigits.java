import java.util.*;

public class _10_SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum of digits of a number : " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
