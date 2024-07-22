package besinci;

public class Calisan {
	protected String adSoyad,ePosta;
	protected int telefon;
	public Calisan(String adSoyad, String ePosta, int telefon) {
		super();
		this.adSoyad = adSoyad;
		this.ePosta = ePosta;
		this.telefon = telefon;
	}
	
	public void giris() {
		
	}
	public void cikis() {
		
	}
	public void yemek() {
		
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}


}
