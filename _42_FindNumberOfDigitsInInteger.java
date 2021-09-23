import java.util.*;

public class _42_FindNumberOfDigitsInInteger {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Find number of digits in an integer is " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;
    }
}
