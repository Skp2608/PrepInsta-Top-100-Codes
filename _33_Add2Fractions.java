import java.util.*;

public class _33_Add2Fractions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numerator for first fraction : ");
        int num1 = scan.nextInt();
        System.out.print("Enter denominator for first fraction : ");
        int den1 = scan.nextInt();
        System.out.print("Enter numerator for second fraction : ");
        int num2 = scan.nextInt();
        System.out.print("Enter denominator for second fraction : ");
        int den2 = scan.nextInt();
        Solution(num1, den1, num2, den2);
    }

    static int HCF(int a, int b) {
        if (b % a == 0)
            return a;
        return HCF(b % a, a);
    }

    static int LCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }

    static void Solution(int num1, int den1, int num2, int den2) {
        int den3 = LCM(den1, den2);
        int num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
        int ans = HCF(den3, num3);
        System.out.print("Add two fractions is " + num3 / ans + "/" + den3 / ans);
    }
}
