package ikinci;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int d;
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Hangi i�lemi yap�ca��n�z� se�in.");
		System.out.println("Toplama i�in 1.");
		System.out.println("��karma i�in 2.");
		System.out.println("�arpma i�in 3.");
		System.out.println("B�lme i�in 4.");
		d = input.nextInt();
		if(d==1) {
			System.out.println("A say�s�n� girin.");
			a = input.nextInt();
			System.out.println("B say�s�n� girin.");
			b = input .nextInt();
			System.out.println("Girdi�iniz say�lar�n toplam� :"+(a+b));
		}
		else if(d==2) {
			System.out.println("A say�s�n� girin.");
			a = input.nextInt();
			System.out.println("B say�s�n� girin.");
			b = input.nextInt();
			System.out.println("Girdi�iniz say�lar�n ��karmas�:"+(a-b));
		}
		else if(d==3) {
			System.out.println("A say�s�n� girin.");
			a = input.nextInt();
			System.out.println("B say�s�n� girin.");
			b = input.nextInt();
			System.out.println("Girdi�iniz say�lar�n �arp�m�:"+(a*b));
		}
		else if(d==4) {
			System.out.println("A say�s�n� girin.");
			a = input.nextInt();
			System.out.println("B say�s�n� girin.");
			b = input.nextInt();
			System.out.println("Girdi�iniz say�lar�n b�l�m�:"+(a/b));
		}
		else {
			System.out.println("Hatal� giri�...");
		}
			
	}

}
