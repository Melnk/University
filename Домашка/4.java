import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        int validNumbers = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            int length = String.valueOf(Math.abs(number)).length();
            boolean allEven = true, allOdd = true;
            int temp = Math.abs(number);

            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) allOdd = false;
                else allEven = false;
                temp /= 10;
            }

            if ((length == 3 || length == 5) && (allEven || allOdd)) {
                validNumbers++;
            }
        }

        System.out.println("Ровно два числа подходят? " + (validNumbers == 2));
    }
}