package ikinci;

public class ForArmstrong {

	public static void main(String[] args) {
		int temp, birler,onlar,y�zler,toplam;
		for(int i = 100; i<999; i++) {
			temp=i;
			birler = temp % 10;
			temp /=10;
			onlar = temp % 10;
			temp /=10;
			y�zler = temp;
			toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(y�zler*y�zler*y�zler);
			if (toplam ==i) {
				System.out.println(i);
			}
		}

	}

}
