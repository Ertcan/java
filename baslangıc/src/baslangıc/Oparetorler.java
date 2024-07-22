package baslangýc;

public class Oparetorler {

	public static void main(String[] args) {
		int a =10;
		int b =5;
		int  toplama = a + b;
		int  cýkarma  = a - b;
		int  carpma = a * b;
		int  bolme  = a / b;
		int mod = a % b;
		System.out.println("Toplama  : "+ toplama);
		System.out.println("Çýkarma : "+ cýkarma);
		System.out.println("Çarpma :"+ carpma);
		System.out.println("Bölme :"+ bolme );				
		System.out.println("Modu :"+ mod);
		toplama++;
		System.out.println(toplama);
		cýkarma--;
		System.out.println(cýkarma);
		int sonuc = a++ + b-- ;
		System.out.println(sonuc);
		int sayi1=10;
		int sayi2=5;
		boolean kosul= (sayi1==sayi2);
		System.out.println(kosul);
		boolean kosul1 = (sayi1 < sayi2);
		boolean kosul2 = (sayi1 > sayi2);
		boolean sonuc2 = kosul1 && kosul2;
		System.out.println(sonuc2);
		boolean sonuc3 =kosul1 || kosul2;
		System.out.println(sonuc3);
		String sonuc4 = kosul1 ? "elma" : "armut";
		System.out.println(sonuc4);
		
	}

}
