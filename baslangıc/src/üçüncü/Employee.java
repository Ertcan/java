package üçüncü;

public class Employee {
private String name;
private double salary;
private int hy;
private int wh;
 Employee (int hy , int  wh , double salary , String name){
	this.name=name;
	this.salary=salary;
	this.wh=wh;	
	this.hy=hy;
}
 double tax(){
	 if(this.salary>1000) {
		 return  salary *0.03;
	 }
	 return 1;
 }
 public int bonus() {
	 int extra = this.wh-40;
	 return extra*30;
 }
 public double raisesalary() {
	 int year = 2020-hy;
	 if(year<10) {
		 return salary * 0.05;
	 }
	 else if(year>=10 && this.hy<20) {
		 return salary * 0.10;
	 }
	 else {
		 return salary * 0.15;
	 }

 }
}
