package ikinci;
import java.util.Scanner;
public class ForAsalSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a ;
		double b = 1;
		boolean asal = true;
		do {
			System.out.println("Lütfen pozitif bir sayý giriniz.");
			a = input.nextDouble();
		}while (a < 2);
		for (double i = 2; i < a; i++) {
			if( a % i == 0) {
				asal = false;
				break;
			}
		}
		if (asal) {
			System.out.println("Girilen sayý :"+a+" asaldýr.");
		}else {
			System.out.println("Girilen sayý :"+a+" asal deðildir");
		}
	}

}
