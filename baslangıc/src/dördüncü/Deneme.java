package dördüncü;
import java.util.Scanner;
public class Deneme {

	public static void main(String[] args) {
		double salad=0 , hamburger=0, pizza=0,tatlı=0;
		int salata=0,ham=0,piz=0,tat = 0;
		int tmp=0;
		int secim;
		double fiyat=0;
		double Kar = 0 ,tkar=0;
		int toplam = 0 ;
		Scanner input = new Scanner(System.in);
		boolean kosul = false;
		System.out.println("----Hoş Geldiniz----");
		while(kosul==false) {
			System.out.println("Salata almak için => 1 ");
			System.out.println("Hamburger almak için => 2 ");
			System.out.println("Pizza almak için => 3 ");
			System.out.println("Tatlı almak için => 4 ");
			System.out.println("Çıkış için => 5 ");
			secim=input.nextInt();
			switch(secim) {
			case 1:
				System.out.println("Kaç tane almak istersiniz?");
				salata=input.nextInt();
				System.out.println("Ne kadar ödemek istersiniz?");
				salad = input.nextDouble();
				break;
			case 2:
				System.out.println("Kaç tane almak istersiniz?");
				ham = input.nextInt();
				System.out.println("Ne kadar ödemek istersiniz?");
				hamburger = input.nextDouble();
				break;
			case 3:
				System.out.println("Kaç tane almak istersiniz?");
				piz = input.nextInt();
				System.out.println("Ne kadar ödemek istersiniz?");
				pizza = input.nextDouble();
				break;
			case 4:
				System.out.println("Kaç tane almak istersiniz?");
				tat = input.nextInt();
				System.out.println("Ne kadar ödemek istersiniz?");
				tatlı = input.nextDouble();
				break;
			case 5:
				kosul=true;
				break;
				default:
					System.out.println("Hatalı giriş tekrar deneyiniz.");
			}
			fiyat=salad+hamburger+pizza+tatlı;
			System.out.println("Toplam tutarınız => "+fiyat);
		}
		Dd Kasiyer = new Dd(salad,hamburger,pizza,tatlı);
		System.out.println("Salata karı => "+Kasiyer.salataKari(Kar));
		Dd Kasiyer2 = new Dd(salata,ham,piz,tat);
		System.out.println("Ismarlanan tatlı sayısı => "+Kasiyer2.tatliSayisiArttir());
		System.out.println("Günlük toplam satış miktarı => "+Kasiyer2.gunlukToplamSatis(toplam));
		System.out.println("Günlük kar => "+Kasiyer.günlükKar(tkar));
	}
}
