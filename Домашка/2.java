import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int evenLocalMaxCount = 0;
        for (int i = 1; i < size - 1; i++) {
            if (array[i] % 2 == 0 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                evenLocalMaxCount++;
            }
        }

        System.out.println("Количество четных локальных максимумов: " + evenLocalMaxCount);
        System.out.println("Ровно два? " + (evenLocalMaxCount == 2));
    }
}