package d�rd�nc�;
import java.util.Scanner;
import java.util.Random;

public class SayiTahmiOyunu {

	public static void main(String[] args) {
		int tahmin ,secim=0,tmp=0,can=5;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int sayi = rand.nextInt(100);
		System.out.println("!!!Say� Tahmin Oyununa ho�geldiniz!!!");
		System.out.println("Hangi zorlukta oynamak istersiniz?");
		System.out.println("Kolay(15 can) => 1 \nOrta(10 can) => 2 \nZor(5 can) => 3");
		secim=input.nextInt();
		if(secim==1) {
		can=15;
		}
		if(secim==2) {
			can=10;
		}
		if(secim==3) {
			can=5;
		}
		System.out.println("!!!Say� tutuldu tahmin edin!!!");
		while(can>0) {
			tahmin=input.nextInt();
			if(tahmin==sayi) {
				System.out.println("!!!Tebrikler bildiniz!!!");
				break;
			}
			if(tahmin<0 || tahmin>99) {
				System.out.println("!!!L�tfen 0 ile 99 aras� say� girin!!!");
			}
			if(tahmin<sayi) {
				System.out.println("!!!Tahmininizi y�kseltin!!!");
			}
			if(tahmin>sayi) {
				System.out.println("!!!Tahmininizi d���r�n!!!");
			}
			if(tahmin!=sayi) {
				can--;
				System.out.println("!!!Kalan Can!!!"+can);
			}
			if(can==0) {
				System.out.println("!!!Do�ru tahmin edemediniz can�n�z bitti!!!");
				System.out.println("Tutulan say� => "+sayi);
			}
		}
		
	}

}
