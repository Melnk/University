import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double z = scanner.nextDouble();
		
		if (a%b == 0){
			z = z*a;
		}	
		else{
			z = z/a;
		}	
		
	}
}