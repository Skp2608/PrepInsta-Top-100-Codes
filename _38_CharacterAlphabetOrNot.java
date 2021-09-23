import java.util.*;

public class _38_CharacterAlphabetOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.print(Solution(ch));
    }

    static String Solution(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return "Character is an alphabet";
        return "Character is not an alphabet";
    }
}
