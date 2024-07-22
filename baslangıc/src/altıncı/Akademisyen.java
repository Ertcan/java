package alt�nc�;

public class Akademisyen implements ICal�san{
	
	private String adSoyad , bolum , gorevler;

	public Akademisyen(String adSoyad, String bolum, String gorevler) {
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.gorevler = gorevler;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	@Override
	public void giris() {
		System.out.println("Giri� yap�ld�");
		
	}

	@Override
	public void c�k�s() {
		System.out.println("��k�� yap�ld�");
		
	}

	@Override
	public boolean yemek(int saati) {
		System.out.println("Yemek yendi!");
		return true;
	}
	
	
}
