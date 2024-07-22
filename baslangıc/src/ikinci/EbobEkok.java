package ikinci;
import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		
 Scanner input = new Scanner(System.in);
 int a=0 , b=0 , ekok=0;
 System.out.println("Bir sayý girin.");
 a=input.nextInt();
 System.out.println("Ýkinci bir sayý girin");
 b=input.nextInt();
 int min = (a < b) ? a : b;
 for(int i= min;i>0;i--) {
	if((a % i == 0 ) && (b % i == 0)) {
		System.out.println("Bu sayýlarýn ebobu "+i+" sayýsýdýr.");
		ekok = (a*b)/i;
		System.out.println("Bu sayýlarýn ekoku "+ekok+" sayýsýdýr.");
		break;
	}
	if ((a % i ==0) && (b % i == 0)){
		System.out.println("Bu sayýlarýn ortak böleni yoktur.");
	}
 }
	}

}
