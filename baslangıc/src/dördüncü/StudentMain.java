package dördüncü;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println(Student.howstudent());
		Student s1 = new Student ("ali", 220,90);
		Student s2 = new Student ("ayşe", 124,70);
		Student s3 = new Student ("adnan", 567,100);
		Student s4 = new Student ("arda", 425,45);
		Student s5 = new Student ("alara", 260,75);
		Student s6 = new Student ("arzu", 257,87);
		System.out.println(Student.howstudent());
		s1.exit();
		System.out.println(Student.howstudent());
		int arr[] = new int[6];
		arr[0]=s1.point;
		arr[1]=s2.point;
		arr[2]=s3.point;
		arr[3]=s4.point;
		arr[4]=s5.point;
		arr[5]=s6.point;
		System.out.println(Student.overall(arr));
	}
}
