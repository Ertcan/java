package baslang�c;

import java.util.Scanner;

public class Plaka {

	public static void main(String[] args) {
		int a;
		System.out.println("bir say� giriniz");
		Scanner klavye= new Scanner(System.in);
		a = klavye.nextInt();
		if (a == 39)
			System.out.println("K�rklareli plakas�d�r.");
					
		else
			System.out.println("bize her yer k�rklareli");
	}

}
