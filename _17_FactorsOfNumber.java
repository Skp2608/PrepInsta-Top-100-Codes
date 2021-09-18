import java.util.Scanner;

public class _17_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution(n);
    }

    static void Solution(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
            System.out.print(i+"  ");
        }
    }
}
