package üçüncü;

public class Fonksiyonlar {

	public static void main(String[] args) {
		
	power(8,5);	
	power(2,3);
	f(4);
	f(6);
	
	}
static void f(int x) {
	int result= (x+2)*6;
	System.out.println(result);
}
 static void power(int n1, int n2) {
	int r = 1;
	for(int i=1;i<=n2;i++) {
		
		r *=n1;
		
	}
	System.out.println(r);
}
}
