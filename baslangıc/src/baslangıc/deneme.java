package baslang�c;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		int a;
		System.out.println("bir say� giriniz");
		Scanner klavye= new Scanner(System.in);
		a = klavye.nextInt();
		if (a % 2 == 0)
		System.out.println("bu say� �ifttir.");
		else
			System.out.println("bu say� tektir.");
		
			
		

	}

}
