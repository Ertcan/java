package ödev;
import java.util.Scanner;
public abstract class Sporcu {
protected int maas , basari;
public String kulup;
Scanner input = new Scanner(System.in);

public void kontrol() {
	bilgiAl();
	if(kulup.equals("basketbol")) {
		yazdir();
	}
	if(kulup.equals("futbol")) {
		yazdir();
	}
	if(kulup.equals("voleybol")) {
		yazdir();
	}
}

public  void bilgiAl()
{
	System.out.println("Oyuncunuzun kulübünü girin.");
	kulup = input.nextLine();
	System.out.println("Oyuncunuzun maaþýný girin.");
	maas = input.nextInt();
	System.out.println("Oyuncunuzun baþarý sýrasýný girin.");
	basari = input.nextInt();
}

public abstract void yazdir();


}
