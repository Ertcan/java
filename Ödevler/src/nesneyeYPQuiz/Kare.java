package nesneyeYPQuiz;

public class Kare implements IAlanCevre{
	private double y;
	
	public Kare(double y) {
		this.y = y;
	}
	public void alan() {
		double alan=0;
		alan = Math.pow(y, 2);
		System.out.println("Karenin Alan� => "+alan);
	}
	
	public void cevre() {
	double cevre =0;
	cevre = 4*y;
	System.out.println("Karenin �evresi => "+cevre);
	}
}
