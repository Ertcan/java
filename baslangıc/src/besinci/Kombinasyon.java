package besinci;
import java.util.Scanner;
public class Kombinasyon {

	public static void main(String[] args) {
		int m , n , sonuc , tmp;
		System.out.println("Sayý girin");
		Scanner input = new Scanner(System.in);
		m = input.nextInt();
		n = input.nextInt();
		sonuc=Kclass.VerileriAl(m, n);
		System.out.println(sonuc);

	}

}
