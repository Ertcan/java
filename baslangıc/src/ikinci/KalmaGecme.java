package ikinci;
import java.util.Scanner;
public class KalmaGecme {

	public static void main(String[] args) {
		int fen,beden,turkce,sosyal,mat;
		double ort;
		Scanner input = new Scanner(System.in);
		System.out.println("T�rk�e notununuzu giriniz.");
		turkce = input.nextInt();
		System.out.println("Matematik notunuzu giriniz.");
		mat = input.nextInt();
		System.out.println("Beden e�itimi notunuzu giriniz.");
		beden = input.nextInt();
		System.out.println("Fen bilgisi notunuzu giriniz.");
		fen = input.nextInt();
		System.out.println("Sosyal bilgiler notunuzu giriniz.");
		sosyal = input.nextInt();
		ort = ((mat+beden+sosyal+turkce+fen)/5);
		if (ort >=50) {
			System.out.println("Notunuz"+ort);
			System.out.println("Ge�tiniz");
		}
		else {
			System.out.println("Notunuz"+ort);
			System.out.println("Kald�n�z.");
		}
	}

}
