package baslang�c;

public class Oparetorler {

	public static void main(String[] args) {
		int a =10;
		int b =5;
		int  toplama = a + b;
		int  c�karma  = a - b;
		int  carpma = a * b;
		int  bolme  = a / b;
		int mod = a % b;
		System.out.println("Toplama  : "+ toplama);
		System.out.println("��karma : "+ c�karma);
		System.out.println("�arpma :"+ carpma);
		System.out.println("B�lme :"+ bolme );				
		System.out.println("Modu :"+ mod);
		toplama++;
		System.out.println(toplama);
		c�karma--;
		System.out.println(c�karma);
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
