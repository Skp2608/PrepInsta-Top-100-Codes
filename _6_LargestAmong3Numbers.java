// Java to Find the Largest Number Among Three Numbers

import java.util.Scanner;

public class _6_LargestAmong3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.println("Largest Number Among Three Numbers : " + Solution(n1, n2, n3));
    }

    static int Solution(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}
