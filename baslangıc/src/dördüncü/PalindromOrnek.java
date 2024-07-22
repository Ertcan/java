package dördüncü;
import java.util.Scanner;
public class PalindromOrnek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str="",tmp="";
			System.out.println("Metin girin");
			str = input.nextLine();
			for(int i =str.length()-1;i >=0; i--) {
				tmp +=str.charAt(i);
			}
			if(tmp.equals(str)) {
				System.out.println("Polindromik sayýdýr.");
			}
			else if(!tmp.equals(str)) {
				System.out.println("Polindromik sayý deðildir.");
			}
			
				
			
		
	}

}
