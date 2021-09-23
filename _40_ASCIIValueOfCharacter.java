import java.util.*;

public class _40_ASCIIValueOfCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.print("ASCII value of a character is " + Solution(ch));
    }

    static int Solution(char ch) {
        return ch;
    }
}
