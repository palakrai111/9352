package jdbcdaoprojectdemo;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(2);
		s.setName("nayan");
	   StudentDao ob = new StudentDao(ConnectionEx1.getCon());
	   ob.addStudent(s);
	   

	}

}
