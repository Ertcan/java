package alt�nc�;

public class NonStatic {

	private int a=10;
	public class Inner {
		int a =1;
		public  void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(NonStatic.this.a);
		}
	}
	Inner i = new Inner();
	public void run() {
		System.out.println(a);
		System.out.println(i.a);
	}
}
