package ikinci;
import java.util.Scanner;
public class S�ralama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("A say�s�n� girin.");
		a=input.nextInt();
		System.out.println("B say�s�n� girin..");
		b=input.nextInt();
		System.out.println("C say�s�n� girin.");
		c=input.nextInt();
		if(a>b && a>c) {
			if(b>c) {
			System.out.println("S�ralama �u �ekildedir."+a+">"+b+">"+c);
			}
			else {
				System.out.println("S�ralama �u �ekildedir."+a+">"+c+">"+b);
			}
		}
		if(b>a && b>c) {
			if(c>a) {
				System.out.println("S�ralama �u �ekildedir"+b+">"+c+">"+a);
			}
			else {
				System.out.println("S�ralama �u �ekildedir"+b+">"+a+">"+c);
			}
		}
		if(c>a && c>b) {
			if(a>b) {
				System.out.println("S�ralama �u �ekildedir"+c+">"+a+">"+b);
			}
			else {
				System.out.println("S�ralama �u �ekildedir"+c+">"+b+">"+a);
			}
		}
		
	}
	

}
