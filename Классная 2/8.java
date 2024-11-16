import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Введите кол-во элементов");
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = random.nextInt(1, 1000);
		}	
		boolean L = false;
		for (int i = 1; i < n-1; i++){
			if (array[i-1] < array[i] && array[i] > array[i+1] && array[i] % 2 ==0){
				L = true;
			}	
		}	
		System.out.println(L);
	}
}