package �dev;
import java.util.Scanner;
public class Kitap {
private String isim="Witcher";
Scanner input = new Scanner(System.in);
public void normal�sim() {
	System.out.println("Kitab�n ismi �uan :"+isim);
}
public void isimKoy() {
	System.out.println("Kitab�n ismini de�i�tirin.");
	isim=input.nextLine();
}
public void cikti1() {
	normal�sim();
}
}
