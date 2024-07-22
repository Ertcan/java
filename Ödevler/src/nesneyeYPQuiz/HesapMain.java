package nesneyeYPQuiz;
import java.util.Scanner;
public class HesapMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secim;
		System.out.println("1 => Üçgen hesap \n2 => Dikdörtgen hesap \n3 => Kare hesap \n4 => Daire hesap \nYapýcaðýnýz iþlemi seçiniz.");
		secim = input.nextInt();
		if(secim==1) {
			Ucgen u = new Ucgen(10,12,13,13);
			u.alan();
			u.cevre();
		}
		if(secim==2) {
			Dikdortgen d = new Dikdortgen(8,6);
			d.alan();
			d.cevre();
		}
		if(secim==3) {
			Kare k = new Kare(5);
			k.alan();
			k.cevre();
		}
		if(secim==4) {
			Daire d = new Daire(6);
			d.alan();
			d.cevre();
		}
		if((secim<1)||(secim>4)){
			System.out.println("Hatalý giriþ...");
		}

	}

}
