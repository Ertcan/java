package baslangýc;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		int a;
		System.out.println("bir sayý giriniz");
		Scanner klavye= new Scanner(System.in);
		a = klavye.nextInt();
		if (a % 2 == 0)
		System.out.println("bu sayý çifttir.");
		else
			System.out.println("bu sayý tektir.");
		
			
		

	}

}
