import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива n: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (i % 2 == 0) ? i + 1 : -(i + 1);
        }

        System.out.println("Полученный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}