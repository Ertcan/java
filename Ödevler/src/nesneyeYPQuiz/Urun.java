package nesneyeYPQuiz;

public class Urun {

	private String urunAd;
	 private double urunFiyat;
	 public Urun(String urunAd,double urunFiyat){
	 this.urunAd=urunAd;
	 this.urunFiyat=urunFiyat;
	 }
	public void KDV(double urunFiyat) {
	 double kdv=0.2;
	 double son_fiyat;
	 son_fiyat = this.urunFiyat+ (kdv* this.urunFiyat);
	 System.out.println("KDV dahil ürünün son fiyatý :" +son_fiyat);
	}
	 public void bilgiAl(){
	 System.out.println("Ürünün adý =>"+this.urunAd);
	 }
	 public String getUrunAd() {
	 return urunAd;
	 }
	 public void setUrunAd(String urunAd) {
	 this.urunAd = urunAd;
	 }
	 public double getUrunFiyat() {
	 return urunFiyat;
	 }
	 public void setUrunFiyat(double urunFiyat) {
	 this.urunFiyat = urunFiyat;
	 }
	}


