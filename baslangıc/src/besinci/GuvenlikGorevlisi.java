package besinci;

public class GuvenlikGorevlisi extends Memurlar{
	protected String belge;
	
	public GuvenlikGorevlisi(String adSoyad, String ePosta, int telefon, int depNo, int mesai, String belge) {
		super(adSoyad, ePosta, telefon, depNo, mesai);
		this.belge = belge;
	}

	protected void nobet() {
		
	}

}
