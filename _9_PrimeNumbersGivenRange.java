// Java Program to print Prime numbers in a given range

import java.util.Scanner;

public class _9_PrimeNumbersGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (Solution(i))
                System.out.println(i + "  ");
        }
    }

    static boolean Solution(int n) {
        if (n == 1)
            return false;
        else if (n == 2)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
