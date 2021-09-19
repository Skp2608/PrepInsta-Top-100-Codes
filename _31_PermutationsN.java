import java.util.Scanner;

public class _31_PermutationsN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        System.out.println("n people can occupy r seats in a classroom is " + Solution(n, r));
    }

    static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    static int Solution(int n, int r) {
        return fact(n) / fact(n - r);
    }
}
