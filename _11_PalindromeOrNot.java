// Palindrome or not using Java

import java.util.*;

public class _11_PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (Solution(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static boolean Solution(String str) {
        int l = str.length() - 1;
        int i = 0;
        while (i < l) {
            if (str.charAt(i) != str.charAt(l))
                return false;
            i++;
            l--;
        }
        return true;
    }
}
