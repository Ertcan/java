package üçüncü;
import java.util.Scanner;
public class OrnekClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String isim;
		int work;
		int t = 0;
		double s = 0;
		int hire;
		double n;
		System.out.println("Çalýþan ismi girin.");
		isim = input.nextLine();
		System.out.println("Kaç yýldýr çalýþýyor?");
		hire = input.nextInt();
		System.out.println("Kaç saat çalýþýyor?");
		work = input.nextInt();
		System.out.println("Ne kadar maaþ alýyor?");
		s = input.nextDouble();
		Employee EmpDriver = new Employee(hire,work,s,isim);
		n=(s+EmpDriver.bonus())-EmpDriver.tax();
		
		System.out.println("Name : "+isim);
		System.out.println("Salary : "+s);
		System.out.println("Work Hours : "+work);
		System.out.println("Hire Date : "+hire);
		System.out.println("Tax : "+EmpDriver.tax());
		System.out.println("Bonus : "+EmpDriver.bonus());
		System.out.println("Raise Of Salary : "+EmpDriver.raisesalary());
		System.out.println("Salary With Tax And Bonus : "+n);
	}

}
