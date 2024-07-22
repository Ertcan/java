package ödev;

public class DersKitabi extends Kitap {
	private String konu = "fantastik";
	
	public void konuYazdir() {
		System.out.println("Kitabýn konusu : "+konu);
	}
	public void konuDegistir() {
		System.out.println("Kitabýn konusunu deðiþtin.");
		konu = input.nextLine();
	}
	
	public void reset() {
		System.out.println("Kitabýn ismi ile konusunu deðiþtirin.");
		isimKoy();
		konuDegistir();
	}
	public void cikti2() {
		cikti1();
		konuYazdir();
	}

}
