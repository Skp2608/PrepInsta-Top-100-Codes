import java.util.Scanner;

public class _32_MaximumNumberOfHandshakes {
    public static void main(String[] s) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Maximum number of handshakes is " + Solution(n));
    }

    static int Solution(int n) {
        return n * (n - 1) / 2;
    }
}
