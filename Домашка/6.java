import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // a^n
        double resultA = Math.pow(a, n);
        System.out.println("a^n: " + resultA);

        // a(a+1)...(a+n-1)
        double resultB = 1;
        for (int i = 0; i < n; i++) {
            resultB *= (a + i);
        }
        System.out.println("a(a+1)...(a+n-1): " + resultB);

        // 1/a + 1/(a(a+1)) + ... + 1/(a(a+1)...(a+n))
        double resultC = 0;
        double denominator = a;
        for (int i = 1; i <= n; i++) {
            resultC += 1 / denominator;
            denominator *= (a + i);
        }
        System.out.println("Сумма ряда (с): " + resultC);

        // 1/a + 1/a^2 + ... + 1/a^(2^n)
        double resultD = 0;
        for (int i = 1; i <= n; i++) {
            resultD += 1 / Math.pow(a, Math.pow(2, i));
        }
        System.out.println("Сумма ряда (d): " + resultD);

        // a(a-n)(a-2n)...(a-n^2)
        double resultE = 1;
        for (int i = 1; i <= n; i++) {
            resultE *= (a - i * n);
        }
        System.out.println("Результат выражения (e): " + resultE);
    }
}