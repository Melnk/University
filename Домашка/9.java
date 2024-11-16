import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // б) 
        double resultB = (x <= 2) ? (Math.pow(x, 2) + 4 * x + 5) : (1 / (Math.pow(x, 2) + 4 * x + 5));
        System.out.println("Результат (б): " + resultB);

        // в)
        double resultC = (x <= 0) ? 0 : (x <= 1) ? x : Math.pow(x, 4);
        System.out.println("Результат (в): " + resultC);

        // г)
        double resultD = (x <= 0) ? 0 : (x <= 1) ? (Math.pow(x, 2) - x) : (-Math.pow(x, 2) * Math.sin(x));
        System.out.println("Результат (г): " + resultD);
    }
}