package dördüncü;
import java.util.Scanner;
public class DizidekiElemanlarýnOrt {

	public static void main(String[] args) {
		double[] ort = new double[3];
		double sayi;
		double toplam=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<ort.length;i++) {
			System.out.println("Deðer girin.");
			ort[i] = input.nextDouble();
		
		}
		//sayi=(ort[0]+ort[1]+ort[2])/ort.length;
		//		System.out.println(sayi);
		for(double not : ort) {
		toplam+=not;
		}
		sayi=toplam/ort.length;
		System.out.println(sayi);
	}

}
