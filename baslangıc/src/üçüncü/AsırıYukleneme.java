package ���nc�;

public class As�r�Yukleneme {
	static int add(int a,int b) {
		System.out.println("1.Metot");
		return a+b;
	}
	static int add(int a,int b,int c) {
		System.out.println("2.Metot");
		return a+b+c;
	}
	static double add(int a,int b,double c) {
		System.out.println("3.Metot");
		return a+b+c;
	}
	public static void main(String[] args) {
	System.out.println(add(1,2));
	System.out.println(add(1,2,3));
	System.out.println(add(1,2,3.1));

	}

}
