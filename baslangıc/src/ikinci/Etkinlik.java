package ikinci;
import java.util.Scanner;
public class Etkinlik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hava;
		System.out.println("Hava s�cakl��� ne kadar?");
		hava = input.nextInt();
		if(hava<=4) {
			System.out.println("Kayak yapman� �neriririm.");
		}
		else if(hava>4 && hava<30) {
			System.out.println("Sinemaya gitmeni �neririm.");
		}
		else {
			System.out.println("Y�zmeye gitmeni �neririm.");
		}

	}

}
