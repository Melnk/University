import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int k = random.nextInt(3,9);
		System.out.println(k);
		int n = scanner.nextInt();
		int decimal = 0, base = 1;
		while (n > 0){
			int digit = n % 10;
			decimal += digit * base;
			base *= k;
			n /= 10;
		}	
		
		System.out.println(decimal);
			
	}
}