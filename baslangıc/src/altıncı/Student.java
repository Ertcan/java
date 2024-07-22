package altýncý;

 public class Student {
	
	public Student find(String id) throws StudentException {
		if(id.equals("123")) {
			return new Student();
		}
		else {
			throw new StudentException("Hata!!"); 
		}
	}
	public int deneme(int a) throws StudentException {
		if(a==0) {
		throw new StudentException("Bölen 0 olamaz!!");	
		}
		return 10;
	}
	}
