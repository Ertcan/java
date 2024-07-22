package altýncý;

public class Static {

	private static int a = 10;
	private static int b = 2;
	public static class Static2{
		int a = 0;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(b);
		}
	}
}
