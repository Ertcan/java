package üçüncü;

public class Recursiveozyineleme {
	static int toplama(int x) {
		int toplam=0;
		for(int i=0;i<=x;i++) {
			toplam+=i;
		}
		return toplam;
	}
	static int r(int x) {
		if(x==1) {
			return 1;
		}
	return x + r(x-1);	
	}
	public static void main(String[] args) {
	System.out.println(toplama(10));	
System.out.println(r(10));
	}

}
