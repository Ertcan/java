package �dev;

public class LiseKitap extends DersKitabi {
	private int fiyat = 50;

	public void fiyatYazdir() {
		System.out.println("Kitab�n fiyat� : "+fiyat);
	}
	private void fiyatDegistir() {
		System.out.println("Yeni fiyat belirleyin.");
		fiyat = input.nextInt();
	}
	public void reset2() {
	reset();
	fiyatDegistir();
	}
	public void cikti3() {
		cikti2();
		fiyatYazdir();
	}
}
