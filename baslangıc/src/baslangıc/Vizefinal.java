package baslangýc;

import java.util.Scanner;

public class Vizefinal {

	public static void main(String[] args) {
		int day;
		System.out.println("1 ile 7 arasýnda sayý girin.");
		Scanner klavye = new Scanner(System.in);
		day = klavye.nextInt();
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
	}

}
