package ikinci;
import java.util.Scanner;
public class BirdenYuzeKadar {

	public static void main(String[] args) {
		int i= 1;
		int a = 0;
		int b= 2;
		int d= 0;
		int toplam =0;
		boolean c = false;
		Scanner input = new Scanner(System.in);
		
		/*while (i<=100) {�rnek 1 
			
			if ( i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		�rnek 2
		while(c == false) { 
			System.out.println("Bir say� girin.");
			a = input.nextInt();
			if(a % 2 == 1) {
			toplam=(a+toplam);
			System.out.println("Girdi�iniz say�lar�n de�eri bu kadar oldu :"+toplam);
			}
			if (a<0) {
				System.out.println("Sistemden ��k�� yap�ld�");
			break;
			}
			
		}
		*/	
			
		System.out.println("Bir say� giriniz.");
		a = input.nextInt();
		while (b<=a){
				System.out.println(b);
			b = b * 2;
		}
	}

}
