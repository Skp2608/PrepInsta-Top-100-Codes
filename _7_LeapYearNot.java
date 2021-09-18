// Java Program to Check Leap Year or not
import java.util.Scanner;

public class _7_LeapYearNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(Solution(year));
    }

    static String Solution(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            return "Leap Year";
        return "Not Leap Year";
    }
}
