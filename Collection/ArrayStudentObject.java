import java.util.*;
public class ArrayStudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student123> a1 = new ArrayList<Student123>();
		Student123 ob1 = new Student123(1,"palak");
		Student123 ob2 = new Student123(1,"nayan");
		Student123 ob3 = new Student123(1,"gagan");
         a1.add(ob3);
         a1.add(ob2);
         a1.add(ob1);
         for(Student123 o: a1)
         {
        	 System.out.println(o.id + " "+o.name);
         }
         
	}

}
