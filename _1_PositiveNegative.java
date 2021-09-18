// Checking if a number is positive or negative using Java
import java.util.*;
class _1_PositiveNegative
{
    public static void main(String str[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution(n);
    }

    static void Solution(int n){
        if(n>0)
        System.out.println("Postive");
        else if (n==0)
        System.out.println("Zero");
        else
        System.out.println("Negative");
    }
}