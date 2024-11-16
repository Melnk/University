import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        double[] array = new double[n];

        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                array[i] *= 0.5;
            } else {
                array[i] += 0.1;
            }
        }

        System.out.println("Измененная последовательность:");
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
    }
}