package ikinci;
import java.util.Scanner;
public class DoWhileÖrnek {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		int number = 0, total = 0;
		do {
			System.out.print("Sayı giriniz: ");
			number = input.nextInt();
			if(number < 0) {
				break;
			} if(number % 2 == 0) {
				total += number; 
			}
		}while(number >= 0);
		System.out.println(total);
	}

}
