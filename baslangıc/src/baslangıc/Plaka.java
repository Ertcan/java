package baslangýc;

import java.util.Scanner;

public class Plaka {

	public static void main(String[] args) {
		int a;
		System.out.println("bir sayý giriniz");
		Scanner klavye= new Scanner(System.in);
		a = klavye.nextInt();
		if (a == 39)
			System.out.println("Kýrklareli plakasýdýr.");
					
		else
			System.out.println("bize her yer kýrklareli");
	}

}
