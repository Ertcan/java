package ikinci;
import java.util.Scanner;
public class While�rnek2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int a = 0 , b = 1, faktor = 1;
		double a = 0 , b = 1 , harmon = 1;
		int y�ld�z = 1 ,s= 0;
		System.out.println("Bir say� giriniz.");
		s = input.nextInt();
		/*while(b <=a) { �rnek 1
			faktor = (faktor * b);
			
			b++;
		}
		System.out.println("Say�n�n fakt�riyeli :"+faktor);
		while(b <= a) {�rnek 2
			harmon = (harmon + 1/b);
			b++;
		}
		System.out.println("Say�n�k Harmoni�i :" + harmon);
		while(y�ld�z<=s) { �rnek 3
			int k = 1;
		while(k<=y�ld�z) {
			System.out.print("*");
		k++;
		}
		System.out.println();
			y�ld�z++;
		
		}*/
		int sayi1,sayi2,sonuc=1;
		System.out.println("�ss� al�nacak say�y� giriniz.");
		sayi1 = input.nextInt();
		System.out.println("�ss�n� giriniz.");
		sayi2 = input.nextInt();
		int i = 1;
		while(i<=sayi2) {
			sonuc = (sayi1 * sonuc);
			i++;
		}
		System.out.println(sonuc);
		
	}

}
