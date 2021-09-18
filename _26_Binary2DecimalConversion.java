import java.util.*;

public class _26_Binary2DecimalConversion {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Decimal Number is " + Solution(n));
    }

    static int Solution(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 10;
            if (!(r == 0 || r == 1)) {
                return -1;
            } else {
                ans += r * Math.pow(2, i);
                i++;
                n/=10;
            }
        }
        return ans;
    }
}
