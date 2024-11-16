import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите p: ");
        double p = scanner.nextDouble();

        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        if (Math.abs(fraction1 - p) < Math.abs(fraction2 - p)) {
            System.out.println("Дробь m/n ближе к p. Умножаем m на 10: " + (m * 10));
        } else {
            System.out.println("Дробь n/m ближе к p. Удваиваем n: " + (n * 2));
        }
    }
}