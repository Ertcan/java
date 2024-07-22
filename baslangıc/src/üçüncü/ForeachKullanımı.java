package üçüncü;

public class ForeachKullanýmý {

	public static void main(String[] args) {
		int[] dizi = new int[4];
		for(int i=0;i<dizi.length;i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("-------------------");
		for(int value : dizi) {
			System.out.println(value);
		}
	}

}
