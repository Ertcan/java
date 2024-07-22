package üçüncü;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int bakiye=1000 , a;
	System.out.println("Candan Banka Hoþgeldiniz!!");
	System.out.println("Güncel bakiyeniz"+bakiye+"TL");
    while(bakiye>0) {
    	System.out.println();
    	System.out.println("1 -) Para Yatýr");
    	System.out.println("2 -) Para Çek");
    	System.out.println("3 -) Bakiye Sorgula");
    	System.out.println("4 -) Çýkýþ Yap");
    	System.out.println("Yapmak istediðiniz iþlemi seçiniz.");
    	a = input.nextInt();
    	if(a==1) {
    		System.out.println("Ne kadar yatýrmak istediðinizi giriniz.");
    		a=input.nextInt();
    		bakiye=a+bakiye;
    		System.out.println("Hesabýnýza paranýz eklenmiþtir þuanki mevcut bakiyeniz :"+bakiye);
    	}
    	else if(a==2) {
    		System.out.println("Ne kadar çekmek istediðinizi giriniz.");
    		a=input.nextInt();
    		
    		 if (a>bakiye) {
    		System.out.println("Bakiyeniz yetersiz.");	
    		}else {
    			bakiye=bakiye-a;
    			System.out.println("Paranýz çekilmiþtir yeni mevcut bakiyeniz:"+bakiye);
    		}
    	
    	
    	}
    	else if(a==3) {
    		System.out.println("Mevcut bakiyeniz :"+bakiye);
    	}
    	else if(a==4) {
    		break;
    	}
    	else {
    		System.out.println("Geçersiz bir tuþa bastýnýz.");
    	}
    }
    System.out.println("Yine Bekleriz!!");
	}

}
