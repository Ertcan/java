package ödev;
import java.util.Scanner;
public class Kitap {
private String isim="Witcher";
Scanner input = new Scanner(System.in);
public void normalİsim() {
	System.out.println("Kitabın ismi şuan :"+isim);
}
public void isimKoy() {
	System.out.println("Kitabın ismini değiştirin.");
	isim=input.nextLine();
}
public void cikti1() {
	normalİsim();
}
}
