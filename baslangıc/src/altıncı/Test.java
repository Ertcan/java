package altýncý;

public class Test {

	public static void main(String[] args) throws StudentException {
		// Student s1 = new Student();
		StudentException sE = new StudentException("Hata!!");
		StudentException.Student sE1 = sE.new Student();
		sE1.find("123");
		
		// s1.find("1234");
		// s1.deneme(0);
	}

}
