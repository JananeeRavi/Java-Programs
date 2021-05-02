
public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println(email + phonenumber);
	}
	public static void main(String[] args) {
		
		
		Students stu = new Students();
		stu.getStudentInfo(1001);
		stu.getStudentInfo(1001, "Jananee Ravi");
		stu.getStudentInfo("123@abc.com", 24850849);
		
		

	}

}
