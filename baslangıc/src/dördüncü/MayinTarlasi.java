package d�rd�nc�;
import java.util.Scanner;
public class MayinTarlasi {

	public static void main(String[] args) {
		int row , col;
		Scanner input = new Scanner(System.in);
		System.out.println("!!!May�n Tarlas�na Ho�geldiniz!!!");
		System.out.println("!!!Harita b�y�kl���n� se�iniz!!!");
		System.out.println("Sat�r b�y�kl��� => ");
		row = input.nextInt();
		System.out.println("S�tun b�y�kl��� => ");
		col=input.nextInt();
		TarlaC mayin = new TarlaC(row,col);
		mayin.run();
	}

}
