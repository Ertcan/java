package dördüncü;

public class Student {
	public String name;
	public int id,point;
	private static int counter = 0;
	
	Student (String name,int id,int point) {
		this.name=name;
		this.id=id;
		this.point=point;
		Student.counter++;
	}
	public static void exit() {
		counter--;
	}
	public static int howstudent() {
		return Student.counter;
	}
	public static double overall(int[] arr) {
		double overall=0;
		for(int i=0;i<arr.length;i++) {
			overall+=arr[i];
		}
		return overall / arr.length;
	}
	

}
