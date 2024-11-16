import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Введите длинну массива: ");
		int length = scanner.nextInt();
		
		int[] array = new int[length];
		
		//System.out.println("Введите элементы массива");
		for (int i = 0; i < length; i++){
			array[i] = random.nextInt(1, 100);
		}
		System.out.println("Ваш массив: ");
		for (int arr : array){
			System.out.print(arr + ", ");
		}
	}
}