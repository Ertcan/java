package nesneyeYPQuiz;

public class Dikdortgen implements IAlanCevre{
	private double a ,b;
	
	public Dikdortgen(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void alan() {
		double alan=0;
		alan=a*b;
		System.out.println("Dikdörtgen Alaný => "+alan);
	}
	public void cevre() {
		double cevre=0;
		cevre = (2*a)+(2*b);
		System.out.println("Dikdörgenin Çevresi => "+cevre);
	}
}
