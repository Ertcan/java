package ikinci;
import java.util.Scanner;
public class FibonacciFor {

	public static void main(String[] args) {
		int s1 = 0,s2 = 1 , scan;
		int toplam = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayý girin.");
		scan = input.nextInt();
		for(int i = 1; i<=scan; i++) {
						System.out.print(s1+" , ");
						toplam = s1 + s2;
						s1 = toplam;
						s1 = s2;
						s2 = toplam;
			
			
		}


	}

}
