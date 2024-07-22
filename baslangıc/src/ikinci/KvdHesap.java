package ikinci;
import java.util.Scanner;
public class KvdHesap {

	public static void main(String[] args) {
		double tutar,kdvlifiyat;
		double kdv = 0.18;
		Scanner input = new Scanner(System.in);
		System.out.println("ürünün tutarýný giriniz:");
		tutar = input.nextDouble();
		kdvlifiyat= tutar + (tutar*kdv);
		System.out.println(kdvlifiyat);

	}

}


