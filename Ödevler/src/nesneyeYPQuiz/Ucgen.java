package nesneyeYPQuiz;

public class Ucgen {
	private double x,h,a,b;
	
	public Ucgen(double x, double h,double a,double b) {
		this.x = x;
		this.h = h;
		this.a = a;
		this.b = b;
	}
	public void alan() {
		double alan=0;
		alan=(x*h)/2;
		System.out.println("Üçgenin Alaný => "+alan);
	}
	public void cevre() {
		double cevre=0;
		cevre = (a+b+x);
		System.out.println("Üçgenin Çevresi => "+cevre);
	}
}
