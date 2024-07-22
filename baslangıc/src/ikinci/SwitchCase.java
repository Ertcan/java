package ikinci;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1:
			System.out.println("sayý 1 e eþittir.");
			break;
		case 2:
			System.out.println("sayý 2 ye eþittir");
			break;
		case 3:
			System.out.println("sayý 3 e eþittir");
			break;
			default :
				System.out.println("Geçersiz sayý girdiniz");
				break;
		}

	}

}
