// Armstrong numbers between two intervals using Java
import java.util.Scanner;

public class _13_ArmstrongNumbersBet2Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (Solution(i))
                System.out.print(i + "  ");
        }
    }

    static int Length(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;
    }

    static boolean Solution(int n) {
        int l = Length(n);
        int sum = 0;
        int ans = n;
        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, l);
            n /= 10;
        }
        if (ans == sum)
            return true;
        return false;
    }
}
