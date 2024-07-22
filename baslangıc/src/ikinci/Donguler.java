package ikinci;
import java.util.Scanner;
public class Donguler {

	public static void main(String[] args) {
	 int i = 1;
	 int a = 0;
	 Scanner input = new Scanner(System.in);
	 System.out.println("1 ila 100 arasý sayý girin.");
	 a = input.nextInt();
	 
	 /*
	 while (i <=5) {
		 
		 System.out.print(i +",");
		 i++;
	 }*/
	 do {
		 System.out.println(i+",");
		 i++;
	 }while(i<=a);

	}

}
