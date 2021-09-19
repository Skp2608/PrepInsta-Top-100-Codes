import java.util.*;

public class _30_FindQuadrantInWhichCoordinateLie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.print(Solution(n1, n2));
    }

    static String Solution(int n1, int n2) {
        if (n1 > 0 && n2 > 0)
            return "Quadrant I";
        else if (n1 < 0 && n2 > 0)
            return "Quadrant II";
        else if (n1 < 0 && n2 < 0)
            return "Quadrant III";
        else if (n1 > 0 && n2 < 0)
            return "Quadrant IV";
        else if (n1 == 0)
            return "Lie on Y-axis";
        else if (n2 == 0)
            return "Lie on X-axis";
        return "Null";
    }
}
