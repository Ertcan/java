package ���nc�;
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
		System.out.println("�al��an ismi girin.");
		isim = input.nextLine();
		System.out.println("Ka� y�ld�r �al���yor?");
		hire = input.nextInt();
		System.out.println("Ka� saat �al���yor?");
		work = input.nextInt();
		System.out.println("Ne kadar maa� al�yor?");
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
