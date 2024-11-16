import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int k = scanner.nextInt();
		switch(k) {
		case 1:
			System.out.println("Sovsem pizdec");
			break;
		case 2:
			System.out.println("Pizdec");
			break;
		case 3:
			System.out.println("Takoye");
			break;
		case 4:
			System.out.println("Normik");
			break;
		case 5: 
			System.out.println("Zaebis");
			break;
		default:
			System.out.println("Error");
		}
			
	}
}