package ���nc�;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int bakiye=1000 , a;
	System.out.println("Candan Banka Ho�geldiniz!!");
	System.out.println("G�ncel bakiyeniz"+bakiye+"TL");
    while(bakiye>0) {
    	System.out.println();
    	System.out.println("1 -) Para Yat�r");
    	System.out.println("2 -) Para �ek");
    	System.out.println("3 -) Bakiye Sorgula");
    	System.out.println("4 -) ��k�� Yap");
    	System.out.println("Yapmak istedi�iniz i�lemi se�iniz.");
    	a = input.nextInt();
    	if(a==1) {
    		System.out.println("Ne kadar yat�rmak istedi�inizi giriniz.");
    		a=input.nextInt();
    		bakiye=a+bakiye;
    		System.out.println("Hesab�n�za paran�z eklenmi�tir �uanki mevcut bakiyeniz :"+bakiye);
    	}
    	else if(a==2) {
    		System.out.println("Ne kadar �ekmek istedi�inizi giriniz.");
    		a=input.nextInt();
    		
    		 if (a>bakiye) {
    		System.out.println("Bakiyeniz yetersiz.");	
    		}else {
    			bakiye=bakiye-a;
    			System.out.println("Paran�z �ekilmi�tir yeni mevcut bakiyeniz:"+bakiye);
    		}
    	
    	
    	}
    	else if(a==3) {
    		System.out.println("Mevcut bakiyeniz :"+bakiye);
    	}
    	else if(a==4) {
    		break;
    	}
    	else {
    		System.out.println("Ge�ersiz bir tu�a bast�n�z.");
    	}
    }
    System.out.println("Yine Bekleriz!!");
	}

}
