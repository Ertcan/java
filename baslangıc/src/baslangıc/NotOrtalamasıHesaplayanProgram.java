package baslang�c;
import java.util.Scanner;
public class NotOrtalamas�HesaplayanProgram {

	public static void main(String[] args) {
		int quiz,vize,ffinal;
		double ort;
		Scanner input = new Scanner(System.in);	
		System.out.println("Quiz notunu giriniz:");
		quiz = input.nextInt();
		System.out.println("Vize notunu giriniz:");
		vize = input.nextInt();
		System.out.println("Final notunu giriniz.");
		ffinal = input.nextInt();
		ort = (quiz * 0.1) + (vize * 0.3) + (ffinal * 0.6);
		System.out.println(ort);
		String sonuc = (ort >= 50) ? "Ge�tiniz" : "Kald�n�z" ;
		System.out.println(sonuc);
	}

}
