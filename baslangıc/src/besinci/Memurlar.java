package besinci;

public class Memurlar extends Calisan{
	protected int depNo,mesai;
	
	public Memurlar(String adSoyad, String ePosta, int telefon, int depNo, int mesai) {
		super(adSoyad, ePosta, telefon);
		this.depNo = depNo;
		this.mesai = mesai;
	}

	protected void calis() {
		
	}

}
