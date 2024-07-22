package nesneyeYPQuiz;

public class Teknoloji extends Urun {

	private String marka;
	 private String model;
	 public Teknoloji(String urunAd, double urunFiyat,String marka,String model){
	 super(urunAd, urunFiyat);
	 this.model=model;
	 this.marka=marka;
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
	 System.out.println("\nTeknoloji =>");
	 super.bilgiAl();
	 KDV(getUrunFiyat());
	 System.out.println("Marka =>" +this.marka);
	 System.out.println("Model =>" +this.model);
	 }
	}


