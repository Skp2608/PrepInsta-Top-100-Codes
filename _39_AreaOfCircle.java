import java.util.*;

public class _39_AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.print("Area of a circle is " + Solution(r));
    }

    static float Solution(int r) {
        return 3.14f * r * r;
    }
}
