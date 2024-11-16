import java.util.*;

public class Task2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        System.out.println(solveA(a, n));
        System.out.println(solveB(a, n));
        System.out.println(solveC(a, n));
    }

    public static double solveA(double a, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static double solveB(double a, int n) {
        double result = a;
        for (int i = 1; i < n; i++) {
            result *= a + i;
        }
        return result;
    }

    public static double solveC(double a, int n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            double k = a;
            for (int j = 1; j <= i; j++) {
                k *= a + j;
            }
            result += 1.0 / k;
        }
        return result;
    }
}
