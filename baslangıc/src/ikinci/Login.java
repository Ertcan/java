package ikinci;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String k_adi , parola;
		System.out.println("Kullan�c� ad� giriniz.");
		k_adi = input.nextLine();
		System.out.println("Parola giriniz.");
		parola = input.nextLine();
		if(k_adi.equals("java")&& parola.equals("123")) {
			System.out.println("Ba�ar�l� giri�.");
		}
		else {
			System.out.println("Kullan�c� ad� veya �ifre hatal�.");
		}
	}

}
