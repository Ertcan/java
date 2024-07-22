package matOdev;

import java.util.Scanner;

public class MatrisMain {

	public static void main(String[] args) {
		int secim =0 ,tercihozel=0 ,sayi=0;
		Scanner input = new Scanner(System.in);
		MatrisClass hesap = new MatrisClass();
		boolean hesap1=true;
		while(hesap1==true) {
		hesap.goster();
		System.out.println("Ne yapmak istersiniz ? \n 1 => Toplama \n 2 => Çýkarma \n 3 => Sabit Sayý ile Çarpma \n 4 => Çarpma \n 5 => Determinantýný alma \n 6 => Tersini alma \n 7 => Ýnvolitif olup olmadýðýna bakma \n 8 => Çýkýþ");
		secim=input.nextInt();
		if(secim==1) {
			hesap.toplama();
			System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden baþlatýlýyor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
		}
		if(secim==2) {
			hesap.cýkarma();
			System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden baþlatýlýyor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
		}
		if(secim==3) {
			hesap.sabitcarpma(sayi);
			System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden baþlatýlýyor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
		}
		if(secim==4) {
			hesap.carpma();
			System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden baþlatýlýyor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
		}
		if(secim==5) {
		hesap.determinant();
		System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
		tercihozel = input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem yeniden baþlatýlýyor.");
			continue;
		}
		if(tercihozel==2) {
			System.out.println("Çýkýþ Yapýlýyor...");
			break;
		}
		}
		if(secim==6) {
		hesap.ters();	
		System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
		tercihozel = input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem yeniden baþlatýlýyor.");
			continue;
		}
		if(tercihozel==2) {
			System.out.println("Çýkýþ Yapýlýyor...");
			break;
		}
		}
		if(secim==7) {
			hesap.involitif();
			System.out.println("Baþka iþlem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hayýr");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden baþlatýlýyor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
		}
		if(secim==8) {
			System.out.println("Çýkýþ Yapýlýyor...");
			break;
		}
		if(secim>8) {
			System.out.println("Hatalý giriþ tekrar deneyin.");
		}
	}
		input.close();
	}
}
