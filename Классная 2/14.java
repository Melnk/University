import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int n = random.nextInt(1,1000);
		int j = random.nextInt(1, n);
		int[] array = new int[n];	
		for (int i = 0; i < n; i++){
			array[i] = random.nextInt(1, 1000);
		}
		int count = 0;
		for (int i = 0; i < n; i++){
			if (i != j) count += array[i];
				
		}
		count = count / (n-1);
		System.out.println(count);
		}
}