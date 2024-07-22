package nesneyeYPQuiz;

public class Daire implements IAlanCevre{
	
	private double r ,pi=3.14;
	
	public Daire(double r) {
		this.r = r;
	}
	public void alan() {
	double alan=0;
	alan= pi *(Math.pow(r, 2));
	System.out.println("Dairenin Alaný => "+alan);
	}
	public void cevre() {
	double cevre =0;
	cevre = 2*pi*r;
	System.out.println("Dairenin Çevresi => "+cevre);
	}

}
