import java.util.Scanner;

public class _19_PerfectNumberOrNot {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Solution(n));
    }

    static String Solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            return "Perfect number";
        return "Not Perfect number";
    }
}
