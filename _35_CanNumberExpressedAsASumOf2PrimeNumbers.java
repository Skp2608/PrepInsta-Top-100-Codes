import java.util.*;

public class _35_CanNumberExpressedAsASumOf2PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution(n);
    }

    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        else if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void Solution(int n) {
        int x = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i)) {
                if (isPrime(n - i)) {
                    System.out.println(i + " and " + (n - i));
                    x = 1;
                }
            }
        }
        if (x == 0)
            System.out.println("Cannot be expressed as a sum of two prime numbers");
    }
}
