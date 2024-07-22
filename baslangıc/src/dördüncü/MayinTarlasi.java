package dördüncü;
import java.util.Scanner;
public class MayinTarlasi {

	public static void main(String[] args) {
		int row , col;
		Scanner input = new Scanner(System.in);
		System.out.println("!!!Mayýn Tarlasýna Hoþgeldiniz!!!");
		System.out.println("!!!Harita büyüklüðünü seçiniz!!!");
		System.out.println("Satýr büyüklüðü => ");
		row = input.nextInt();
		System.out.println("Sütun büyüklüðü => ");
		col=input.nextInt();
		TarlaC mayin = new TarlaC(row,col);
		mayin.run();
	}

}
