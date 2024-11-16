import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a = scanner.nextInt();
		
		if (-2 <= a && a < 2){
			System.out.println(a*a);
		}	
		else{
			System.out.println(4);
		}	
		
		if (a <= 2) System.out.println(a*a + 4 * a + 5);
		else System.out.println(1/(a*a + 4 * a + 5));
		
		if (a<=0) System.out.println(0);
		else if (0 < a && a <= 1) System.out.println(a);
		else System.out.println(Math.pow(a,4));
		
		if (a <= 0){
			System.out.println(0);
		}	
		else if( 0 < a && a <= 1) System.out.println(a*a - a);
		else System.out.println(a*a - Math.sin(Math.PI * a * a));
		
	}
}