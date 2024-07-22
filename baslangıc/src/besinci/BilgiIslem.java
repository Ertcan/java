package besinci;

public class BilgiIslem extends Memurlar {
	protected String gorev;
	
	public BilgiIslem(String adSoyad, String ePosta, int telefon, int depNo, int mesai, String gorev) {
		super(adSoyad, ePosta, telefon, depNo, mesai);
		this.gorev = gorev;
	}

	protected void tarama() {
		
	}

}
