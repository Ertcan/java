package ikinci;

public class ForArmstrong {

	public static void main(String[] args) {
		int temp, birler,onlar,yüzler,toplam;
		for(int i = 100; i<999; i++) {
			temp=i;
			birler = temp % 10;
			temp /=10;
			onlar = temp % 10;
			temp /=10;
			yüzler = temp;
			toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yüzler*yüzler*yüzler);
			if (toplam ==i) {
				System.out.println(i);
			}
		}

	}

}
