package ikinci;
import java.util.Scanner;
public class CemberHesap {

	public static void main(String[] args) {
		double alan , hacim;
		int r;
		double pi= 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Yarýçap giriniz.");
		r = input.nextInt();
		alan = 2*pi*r ;
		hacim = pi * (r*r);
		System.out.println("Dairenin alaný :"+alan);
		System.out.println("Dairenin hacmi:"+hacim);
	}

}
