import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (n <= 100): ");
        int n = scanner.nextInt();

        // a) Сколько цифр в числе
        int digitCount = String.valueOf(n).length();
        System.out.println("Количество цифр: " + digitCount);

        // b) Сумма цифр
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Сумма цифр: " + sum);

        // c) Первая цифра
        int firstDigit = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(0)));
        System.out.println("Первая цифра: " + firstDigit);

        // d) Предпоследняя цифра (если n >= 10)
        if (n >= 10) {
            int secondLastDigit = (n / 10) % 10;
            System.out.println("Предпоследняя цифра: " + secondLastDigit);
        }
    }
}