import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int n = scanner.nextInt();
		int[] array = new int[n];	
		for (int i = 0; i < n; i++){
			array[i] = random.nextInt(1, 1000);
		}
		int count = 0;
		for (int arr : array){
			if (arr > 0){
				count += arr*2;
			}
		}
		System.out.println(count);
		}
}