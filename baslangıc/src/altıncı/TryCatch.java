package alt�nc�;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		int a = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Say� Girin!");
	
		try {
			a = input.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			a=2/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		int arr[] = new int[3];
		try {
			arr[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getLocalizedMessage());
		System.out.println("Dizi Hatas� !!");
		}finally {
			System.out.println("�ptal");
		}
	
		
	}

}
