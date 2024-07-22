package altýncý;

public class Local {
	public void run() {
		class Yerel {
			int a = 10;

			Yerel(int a) {
				this.a = a;
			}

			public void print() {
				System.out.println(a);
			}
		}
		Yerel y = new Yerel(11);
		y.print();
	}

}
