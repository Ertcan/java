package ikinci;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("say� giriniz");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1:
			System.out.println("say� 1 e e�ittir.");
			break;
		case 2:
			System.out.println("say� 2 ye e�ittir");
			break;
		case 3:
			System.out.println("say� 3 e e�ittir");
			break;
			default :
				System.out.println("Ge�ersiz say� girdiniz");
				break;
		}

	}

}
