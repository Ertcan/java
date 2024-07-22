package ikinci;
import java.util.Scanner;
public class UcakbiletiFiyat {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int km,yas,tip;
	double yol, sonfiyat,indirim1,indirim2;
	System.out.println("Mesafeyi giriniz.");
	km = input.nextInt();
	System.out.println("Yaþýnýzý giriniz.");
	yas = input.nextInt();
	System.out.println("Yolculuk türünü seçiniz. (1 = Tek gidiþ , 2 = Gidiþ/Dönüþ) :");
	tip = input.nextInt();
	if(km>0 && yas>0 &&(tip==1 || tip==2)) {
		System.out.println("Girdiler doðru.");
	}
	else {
		System.out.println("Girdiler yanlýþ!!");
	}
	yol = (km*0.10);
	System.out.println("Ýndirimsiz fiyat : "+yol);
	if(yas<=12 && tip==2) {
	indirim1=(yol*0.5);
	indirim2=(yol*0.2);
	sonfiyat=(yol-(indirim1+indirim2));
	System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if(yas<=12 && tip==1) {
	indirim1=(yol*0.5);
	sonfiyat=(yol-indirim1);
	System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if((yas>12 && tip==2)&& yas<=24) {
	indirim1=(yol*0.10);
	indirim2=(yol*0.20);
	sonfiyat=(yol-(indirim1+indirim2));
	System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if((yas>12 && tip==1)&& yas<=24) {
		indirim1=(yol*0.10);
		sonfiyat=(yol-indirim1);
		System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if((yas>24 && tip==2)&& yas<65) {
		indirim1=(yol*0.20);
		sonfiyat=(yol-indirim1);
		System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if(yas>=65 && tip==2) {
		indirim1=(yol*0.30);
		indirim2=(yol*0.20);
		sonfiyat=(yol-(indirim1+indirim2));
		System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else if(yas>=65 && tip==1) {
	indirim1=(yol*0.30);
	sonfiyat=(yol-indirim1);
	System.out.println("Ýndirimli fiyatýnýz: "+sonfiyat);
	}
	else {
		System.out.println("Ýndiriminiz yoktur.");
	}
	}

}
