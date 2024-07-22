package besinci;

public class Akademisyen extends Calisan{
	protected String bolum,gorev;
	protected String dersler;
	
	public Akademisyen(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String dersler) {
		super(adSoyad, ePosta, telefon);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}

	protected void derseGir() {
		
	}

}
