package ikinci;
import java.util.Scanner;
public class ForAsalSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a ;
		double b = 1;
		boolean asal = true;
		do {
			System.out.println("L�tfen pozitif bir say� giriniz.");
			a = input.nextDouble();
		}while (a < 2);
		for (double i = 2; i < a; i++) {
			if( a % i == 0) {
				asal = false;
				break;
			}
		}
		if (asal) {
			System.out.println("Girilen say� :"+a+" asald�r.");
		}else {
			System.out.println("Girilen say� :"+a+" asal de�ildir");
		}
	}

}
