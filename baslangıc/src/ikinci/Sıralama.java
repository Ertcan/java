package ikinci;
import java.util.Scanner;
public class Sýralama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("A sayýsýný girin.");
		a=input.nextInt();
		System.out.println("B sayýsýný girin..");
		b=input.nextInt();
		System.out.println("C sayýsýný girin.");
		c=input.nextInt();
		if(a>b && a>c) {
			if(b>c) {
			System.out.println("Sýralama þu þekildedir."+a+">"+b+">"+c);
			}
			else {
				System.out.println("Sýralama þu þekildedir."+a+">"+c+">"+b);
			}
		}
		if(b>a && b>c) {
			if(c>a) {
				System.out.println("Sýralama þu þekildedir"+b+">"+c+">"+a);
			}
			else {
				System.out.println("Sýralama þu þekildedir"+b+">"+a+">"+c);
			}
		}
		if(c>a && c>b) {
			if(a>b) {
				System.out.println("Sýralama þu þekildedir"+c+">"+a+">"+b);
			}
			else {
				System.out.println("Sýralama þu þekildedir"+c+">"+b+">"+a);
			}
		}
		
	}
	

}
