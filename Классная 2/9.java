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
		int count5 = 0;
		int count7 = 0;
		for (int arr : array){
			if (arr % 5 == 0) {
				count5 += arr;
			}	
			if (arr%7==0) { 
				count7 += arr;
			}
		}
		System.out.println(count5);
		System.out.println(count7);
		}
}