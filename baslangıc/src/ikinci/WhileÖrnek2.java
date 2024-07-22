package ikinci;
import java.util.Scanner;
public class WhileÖrnek2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int a = 0 , b = 1, faktor = 1;
		double a = 0 , b = 1 , harmon = 1;
		int yýldýz = 1 ,s= 0;
		System.out.println("Bir sayý giriniz.");
		s = input.nextInt();
		/*while(b <=a) { Örnek 1
			faktor = (faktor * b);
			
			b++;
		}
		System.out.println("Sayýnýn faktöriyeli :"+faktor);
		while(b <= a) {Örnek 2
			harmon = (harmon + 1/b);
			b++;
		}
		System.out.println("Sayýnýk Harmoniði :" + harmon);
		while(yýldýz<=s) { Örnek 3
			int k = 1;
		while(k<=yýldýz) {
			System.out.print("*");
		k++;
		}
		System.out.println();
			yýldýz++;
		
		}*/
		int sayi1,sayi2,sonuc=1;
		System.out.println("Üssü alýnacak sayýyý giriniz.");
		sayi1 = input.nextInt();
		System.out.println("Üssünü giriniz.");
		sayi2 = input.nextInt();
		int i = 1;
		while(i<=sayi2) {
			sonuc = (sayi1 * sonuc);
			i++;
		}
		System.out.println(sonuc);
		
	}

}
