package besinci;

public class Asistan extends Akademisyen{
	
	protected String yuksekLisans;
	


	public Asistan(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String dersler,
			String yuksekLisans) {
		super(adSoyad, ePosta, telefon, bolum, gorev, dersler);
		this.yuksekLisans = yuksekLisans;
	}
	protected void lablaraGir() {
		
	}
	protected void quizleriOku() {
		
	}

}
