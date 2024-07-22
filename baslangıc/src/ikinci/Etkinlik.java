package ikinci;
import java.util.Scanner;
public class Etkinlik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hava;
		System.out.println("Hava sıcaklığı ne kadar?");
		hava = input.nextInt();
		if(hava<=4) {
			System.out.println("Kayak yapmanı öneriririm.");
		}
		else if(hava>4 && hava<30) {
			System.out.println("Sinemaya gitmeni öneririm.");
		}
		else {
			System.out.println("Yüzmeye gitmeni öneririm.");
		}

	}

}
