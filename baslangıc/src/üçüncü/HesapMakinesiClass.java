package üçüncü;
import java.util.Scanner;
public class HesapMakinesiClass {
Scanner input = new Scanner(System.in);
public int a = 0, b = 0;
HesapMakinesiClass(int a,int b){
	this.a = a;
	this.b = b;
}
public int toplama() {
	return this.a + this.b;
}
public int cıkarma() {
	return this.a - this.b;
}
public int carpma() {
	return this.a * this.b;
}
public int bolme() {
	return this.a / this.b;
}

}
