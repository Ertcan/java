package besinci;
import java.util.*;
public class FaktoriyelToplama {

	public static void main(String[] args) {
		int x=0;
		Scanner input = new Scanner(System.in); 
		System.out.println("Sayý girin");
		x = input.nextInt();
		Fclass.toplama(x);
		Fclass.faktor(x);
		System.out.println(Fclass.toplama(x));

	}

}
