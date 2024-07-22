package deneme;
import java.util.Scanner;
import java.util.Random;
public class Deneme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(6);
		double x=0,tmp=0;
		/*int y = 0,z=0;
		System.out.println("Sayý girin.");
		x=input.nextInt();
		for(int i =0;i<=x;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int s1=0,s2=1,toplam=0;
		System.out.println("Sayý girin");
		x=input.nextInt();
		for(int i=0;i<=x;i++) {
			toplam=s1+s2;
			System.out.print(s1+" ");
			s2=s1;
			s1=toplam;
		}
		System.out.println("Bir deðer girin.");
		x=input.nextInt();
		for(int i=0;i<4;i++) {
			tmp=x;
			 y =tmp % 10;
			tmp=tmp/10;
			 z=tmp%10;
			tmp=tmp/10;
		}
		System.out.println(y+z+tmp);
		System.out.println("Sayý girin");
		x = input.nextInt();
		tmp = x % 10;
		x /=10;
		x+=tmp;
		System.out.println(x);
		System.out.println("Sayý girin.");
		x = input.nextInt();
		if(x % 2==0) {
			System.out.println("Bu sayý çift sayýdýr");
		}
		else {
			System.out.println("Bu sayý tek sayýdýr.");
		}
		double fx, gx;
		System.out.println("Bir sayý girin.");
		x=input.nextDouble();
		if(x<=0) {
		fx = 1/(1+Math.pow(x, 2));
		gx = 1/(1+x+Math.pow(x, 2));
		System.out.println(+fx+" "+gx);
		}
		if(x>0) {
		fx=1/(1+Math.log10(x));
		gx=1/(x+Math.log10(x));
		System.out.println(+fx+" "+gx);
		}
	
	System.out.println("Bir sayý girin.");
	x = input.nextDouble();
	if(x>0) {
		System.out.println(Math.sqrt(x));
	}
	else {
		System.out.println("Negatif ve 0 deðeri girilemez");
	}
		System.out.println("Sayý gir");
		x=input.nextDouble();
		for(int i=0;i<=x;i++) {
			int zar1= rand.nextInt(7);
			int zar2=rand.nextInt(7);
			if(zar1==0) {
				zar1=rand.nextInt(7);
			}
			if(zar2==0) {
				zar2=rand.nextInt(7);
			}
			if(zar1==6 && zar2==6 ) {
			System.out.println("Zar Atýldý Gelenler."+zar1+" "+zar2);
			}
		}
		
		System.out.println("Bir sayý girin.");
		x=input.nextDouble();
		for(int i = 0;i<=x;i++) {
			if(x % i==0) {
				System.out.println(i);
			}
		}*/
		int sayi=0,faktor=1,toplam=0;
		System.out.println("Sayý girin");
		sayi = input.nextInt();
		for(int i=1;i<=sayi;i++) {
			for(int j=1;j<=sayi;j++) {
				faktor=j*faktor;
			}
			toplam+=faktor;
		}
		System.out.println(faktor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
