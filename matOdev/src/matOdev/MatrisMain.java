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
		System.out.println("Ne yapmak istersiniz ? \n 1 => Toplama \n 2 => ��karma \n 3 => Sabit Say� ile �arpma \n 4 => �arpma \n 5 => Determinant�n� alma \n 6 => Tersini alma \n 7 => �nvolitif olup olmad���na bakma \n 8 => ��k��");
		secim=input.nextInt();
		if(secim==1) {
			hesap.toplama();
			System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden ba�lat�l�yor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
		}
		if(secim==2) {
			hesap.c�karma();
			System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden ba�lat�l�yor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
		}
		if(secim==3) {
			hesap.sabitcarpma(sayi);
			System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden ba�lat�l�yor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
		}
		if(secim==4) {
			hesap.carpma();
			System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden ba�lat�l�yor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
		}
		if(secim==5) {
		hesap.determinant();
		System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
		tercihozel = input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem yeniden ba�lat�l�yor.");
			continue;
		}
		if(tercihozel==2) {
			System.out.println("��k�� Yap�l�yor...");
			break;
		}
		}
		if(secim==6) {
		hesap.ters();	
		System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
		tercihozel = input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem yeniden ba�lat�l�yor.");
			continue;
		}
		if(tercihozel==2) {
			System.out.println("��k�� Yap�l�yor...");
			break;
		}
		}
		if(secim==7) {
			hesap.involitif();
			System.out.println("Ba�ka i�lem yapmak istiyor musunuz ? \n 1 => Evet \n 2 => Hay�r");
			tercihozel = input.nextInt();
			if(tercihozel==1) {
				System.out.println("Sistem yeniden ba�lat�l�yor.");
				continue;
			}
			if(tercihozel==2) {
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
		}
		if(secim==8) {
			System.out.println("��k�� Yap�l�yor...");
			break;
		}
		if(secim>8) {
			System.out.println("Hatal� giri� tekrar deneyin.");
		}
	}
		input.close();
	}
}
