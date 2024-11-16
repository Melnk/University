import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст n (n <= 100): ");
        int n = scanner.nextInt();

        String result;
        if (n % 10 == 1 && n % 100 != 11) {
            result = n + " год";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            result = n + " года";
        } else {
            result = n + " лет";
        }

        System.out.println(result);
    }
}