
public class _41_PrimeNumberBetween1to100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (Solution(i))
                System.out.print(i + "  ");
        }
    }

    static boolean Solution(int n) {
        if (n == 1)
            return false;
        else if (n == 2)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
