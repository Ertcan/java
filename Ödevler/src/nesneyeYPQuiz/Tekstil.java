package nesneyeYPQuiz;

public class Tekstil extends Urun {
		 private String beden;
		 public Tekstil(String urunAd,double urunFiyat,String beden){
		 super(urunAd,urunFiyat);
		 this.beden=beden;
		 }
		 @Override
		 public void KDV(double urunFiyat) {
		 double kdv=0.2;
		 double sonFiyat=urunFiyat+ (kdv*urunFiyat);
		 System.out.println("KDV'siz Fiyat =>"+urunFiyat);
		 System.out.println("KDV'li Fiyat  => " +sonFiyat);
		 }
		 @Override
		 public void bilgiAl(){
		 System.out.println("\nTekstil =>");
		 super.bilgiAl();
		 KDV(getUrunFiyat());
		 System.out.println("Beden =>" +this.beden);
		 }
		}

