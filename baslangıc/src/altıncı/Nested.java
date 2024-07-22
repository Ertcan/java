package altýncý;

public class Nested {

	public static void main(String[] args) {
		NonStatic a = new NonStatic();
		NonStatic.Inner an = a.new Inner();
		// an.run();
		System.out.println("--------------");
		// a.run();
		Static.Static2 s = new Static.Static2();
		// s.run();
		Local l = new Local();
		// l.run();
		Anonymous y = new Anonymous() {
			public void run() {
				System.out.println("Anomim sýnýfý run metodu ! ");
			}
		};
		y.run();
	}

}
