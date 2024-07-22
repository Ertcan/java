package besinci;

public class Ogretmen  extends Akademisyen{
	protected String unvan;
	

	public Ogretmen(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String dersler,
			String unvan) {
		super(adSoyad, ePosta, telefon, bolum, gorev, dersler);
		this.unvan = unvan;
	}
	protected void toplantiGir() {
		
	}
	protected void sinavlariOku() {
		
	}

}
