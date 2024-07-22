package ikinci;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int d;
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Hangi iþlemi yapýcaðýnýzý seçin.");
		System.out.println("Toplama için 1.");
		System.out.println("Çýkarma için 2.");
		System.out.println("Çarpma için 3.");
		System.out.println("Bölme için 4.");
		d = input.nextInt();
		if(d==1) {
			System.out.println("A sayýsýný girin.");
			a = input.nextInt();
			System.out.println("B sayýsýný girin.");
			b = input .nextInt();
			System.out.println("Girdiðiniz sayýlarýn toplamý :"+(a+b));
		}
		else if(d==2) {
			System.out.println("A sayýsýný girin.");
			a = input.nextInt();
			System.out.println("B sayýsýný girin.");
			b = input.nextInt();
			System.out.println("Girdiðiniz sayýlarýn çýkarmasý:"+(a-b));
		}
		else if(d==3) {
			System.out.println("A sayýsýný girin.");
			a = input.nextInt();
			System.out.println("B sayýsýný girin.");
			b = input.nextInt();
			System.out.println("Girdiðiniz sayýlarýn çarpýmý:"+(a*b));
		}
		else if(d==4) {
			System.out.println("A sayýsýný girin.");
			a = input.nextInt();
			System.out.println("B sayýsýný girin.");
			b = input.nextInt();
			System.out.println("Girdiðiniz sayýlarýn bölümü:"+(a/b));
		}
		else {
			System.out.println("Hatalý giriþ...");
		}
			
	}

}
