package baslang�c;
import java.util.Scanner;
public class Scannerr {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a,b;
		System.out.println("A say�s�n� giriniz.");
		a = input.nextInt();
		System.out.println("B say�s�n� giriniz.");
		b= input.nextInt();
		System.out.println("A say�s� :"+a);
		System.out.println("B say�s� :"+b);
	}

}
