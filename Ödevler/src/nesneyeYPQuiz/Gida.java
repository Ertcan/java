package nesneyeYPQuiz;

public class Gida extends Urun {

	private String tur;
	 private double gramaj;
	 public Gida(String urunAd, double urunFiyat,String tur,double gramaj) {
	 super(urunAd, urunFiyat);
	 this.tur=tur;
	 this.gramaj=gramaj;
	 }
	 @Override
	 public void KDV(double urunFiyat) {
	 double kdv=0.2;
	 double sonFiyat;
	 System.out.println("KDV'siz Fiyatý => "+urunFiyat);
	 sonFiyat=urunFiyat+ (kdv*urunFiyat);
	 System.out.println("KDV'li Fiyatý =>" +sonFiyat);
	 }
	 @Override
	 public void bilgiAl(){
	 System.out.println("\nGýda =>");
	 super.bilgiAl();
	 KDV(getUrunFiyat());
	 System.out.println("Tur =>" +this.tur);
	 System.out.println("Gramaj =>" +this.gramaj);
	 }
	}

