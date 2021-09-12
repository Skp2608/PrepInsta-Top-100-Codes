// LCM of two numbers using Java

import java.util.*;

public class _25_LCMOf2Numb {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.print("LCM of two numbers is " + Solution(n1, n2));
    }

    static int HCF(int a, int b) {
        if (b % a == 0)
            return a;
        return HCF(b % a, a);
    }

    static int Solution(int a, int b) {
        return (a *b) / HCF(a, b);
    }
}