package �dev;

public class DersKitabi extends Kitap {
	private String konu = "fantastik";
	
	public void konuYazdir() {
		System.out.println("Kitab�n konusu : "+konu);
	}
	public void konuDegistir() {
		System.out.println("Kitab�n konusunu de�i�tin.");
		konu = input.nextLine();
	}
	
	public void reset() {
		System.out.println("Kitab�n ismi ile konusunu de�i�tirin.");
		isimKoy();
		konuDegistir();
	}
	public void cikti2() {
		cikti1();
		konuYazdir();
	}

}
