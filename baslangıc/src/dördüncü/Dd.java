package dördüncü;

public class Dd {
	private double salad ;
	private double tatli;
	private double Kar;
	private double hamburger;
	private double pizza;
	private double fiyat;
	private int salata;
	private int ham;
	private int piz;
	private int tat;
Dd (double salad , double  hamburger , double pizza , double tatli){
	this.salad=salad;
	this.tatli=tatli;
	this.hamburger=hamburger;
	this.pizza=pizza;
	this.Kar=Kar;	
	this.fiyat=fiyat;
}
Dd (int salata , int ham , int piz , int tat){
	this.salata=salata;
	this.ham=ham;
	this.piz=piz;
	this.tat=tat;
}
double salataKari(double Kar) {
	return Kar = (salad*0.3);
}
int tatliSayisiArttir() {
	return tat;
}

int gunlukToplamSatis(int toplam) {
	return  toplam =salata+ham+piz+tat;
}
double günlükKar(double tkar) {
	return tkar =(salad*0.3)+(hamburger*0.25)+(pizza*0.35)+(tatli*0.2);
}
}
