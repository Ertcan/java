package baslangýc;
import java.util.Scanner;
public class Scannerr {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a,b;
		System.out.println("A sayýsýný giriniz.");
		a = input.nextInt();
		System.out.println("B sayýsýný giriniz.");
		b= input.nextInt();
		System.out.println("A sayýsý :"+a);
		System.out.println("B sayýsý :"+b);
	}

}
