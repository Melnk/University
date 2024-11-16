import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int x = scanner.nextInt();
		System.out.println("Введите номер из меню от 1 до 4");
		
		switch (scanner.nextInt()) {
			case 1:
				System.out.println(x*x);
				break;
			case 2:
				System.out.println(Math.sqrt(x));
				break;
			case 3:
				System.out.println(Math.sin(x));
				break;
			case 4:
				System.out.println(Math.cos(x));
				break;
			default:
				System.out.println("Не суети да");
		}	
			
	}
}