package altýncý;

public class StudentException extends Exception{
	public StudentException(String msg) {
		super(msg);
	}
	public class Student {
		public Student find(String id) throws StudentException {
			if(id.equals("123")) {
				return new Student();
			}
			else {
				throw new StudentException("Hata!!"); 
			}
		}
	}
}
