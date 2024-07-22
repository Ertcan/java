package ikinci;
import java.util.Scanner;
public class Donguleriki {

	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("1 ila 100 arasýnda sayý girin.");
		a = input.nextInt();
		for(i=1; i<=a; i++){
			System.out.println(i+",");
			
		}
	}

}
