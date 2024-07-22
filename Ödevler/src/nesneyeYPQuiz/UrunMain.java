package nesneyeYPQuiz;

public class UrunMain {

	public static void main(String[] args) {
		Tekstil TE =new Tekstil("Ceket",340,"XL");
		Teknoloji T=new Teknoloji("Dizüstü Bilgisiyar",15000,"Monster","Tulpar T5");
		 Gida G =new Gida("Kraker",8,"Tuzlu Yiyecek",114.8);
		 G.bilgiAl();
		 T.bilgiAl();
		 TE.bilgiAl();

	}

}
