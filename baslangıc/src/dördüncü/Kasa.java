package d�rd�nc�;
import java.util.Scanner;
public class Kasa {


	public static void main(String[] args) {
		double salad=0 , hamburger=0, pizza=0,tatl�=0;
		int salata=0,ham=0,piz=0,tat = 0;
		int tmp=0;
		int secim;
		double fiyat=0;
		double Kar = 0 ,tkar=0;
		int toplam = 0 ;
		Scanner input = new Scanner(System.in);
		boolean kosul = false;
		System.out.println("----Ho� Geldiniz----");
		while(kosul==false) {
			System.out.println("Salata almak i�in => 1 ");
			System.out.println("Hamburger almak i�in => 2 ");
			System.out.println("Pizza almak i�in => 3 ");
			System.out.println("Tatl� almak i�in => 4 ");
			System.out.println("��k�� i�in => 5 ");
			secim=input.nextInt();
			switch(secim) {
			case 1:
				System.out.println("Ka� tane almak istersiniz?");
				salata=input.nextInt();
				System.out.println("Ne kadar �demek istersiniz?");
				salad = input.nextDouble();
				break;
			case 2:
				System.out.println("Ka� tane almak istersiniz?");
				ham = input.nextInt();
				System.out.println("Ne kadar �demek istersiniz?");
				hamburger = input.nextDouble();
				break;
			case 3:
				System.out.println("Ka� tane almak istersiniz?");
				piz = input.nextInt();
				System.out.println("Ne kadar �demek istersiniz?");
				pizza = input.nextDouble();
				break;
			case 4:
				System.out.println("Ka� tane almak istersiniz?");
				tat = input.nextInt();
				System.out.println("Ne kadar �demek istersiniz?");
				tatl� = input.nextDouble();
				break;
			case 5:
				kosul=true;
				break;
				default:
					System.out.println("Hatal� giri� tekrar deneyiniz.");
			}
			fiyat=salad+hamburger+pizza+tatl�;
			System.out.println("Toplam tutar�n�z => "+fiyat);
		}
		Kasiyer kasiyer = new Kasiyer(salad,hamburger,pizza,tatl�);
		System.out.println("Salata kar� => "+kasiyer.salataKari(Kar));
		Kasiyer kasiyer2 = new Kasiyer(salata,ham,piz,tat);
		System.out.println("Ismarlanan tatl� say�s� => "+kasiyer2.tatliSayisiArttir());
		System.out.println("G�nl�k toplam sat�� miktar� => "+kasiyer2.gunlukToplamSatis(toplam));
		System.out.println("G�nl�k kar => "+kasiyer.g�nl�kKar(tkar));
	}
}




