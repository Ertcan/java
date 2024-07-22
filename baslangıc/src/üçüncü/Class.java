package üçüncü;
import java.util.Scanner;
public class Class {
//public int s1 = 0;
//public int s2 = 0;
	public static void main(String[] args) {
		int x , y;
		int secim;
		boolean tercih=false;
	Scanner input = new Scanner(System.in);
	while(tercih==false) {
	System.out.println("Bir sayý girin.");
	x = input.nextInt();
	System.out.println("Bir sayý girin.");
	y = input.nextInt();
		HesapMakinesiClass hesap = new HesapMakinesiClass(x,y);
		//hesap.a=10;
		//hesap.b=20;
		//System.out.println(hesap.a+""+hesap.b);
		//HesapMakinesiClass hesap2 = new HesapMakinesiClass();
		//hesap2.b=40;
		//System.out.println(hesap2.b);
		//Class hesap3 = new Class();
		//hesap3.s1=70;
		//System.out.println(hesap3.s1);
		System.out.println("Yapmak istedðiniz iþlemi seçin.");
		System.out.println("1-toplama 2-cýkarma 3-çarpma 4-bölme");
		secim = input.nextInt();
		if(secim==1) {
			System.out.println(hesap.toplama());
			
		}
		if(secim==2) {
			System.out.println(hesap.cýkarma());
		}
		if(secim==3) {
			System.out.println(hesap.carpma());
		}
		if(secim==4) {
			System.out.println(hesap.bolme());
		}
		
		
	}
	}

}
