package jdbcdaoprojectdemo;
import java.sql.*;
public class StudentDao 
{
	Connection con;
	StudentDao(Connection con)
	{
		this.con = con;
	}

	void addStudent(Student ob)
	{
		String query = "insert into student values(?,?)";
		   try {
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setInt(1,ob.getId());
		  ps.setString(2,ob.getName());
		   int i = ps.executeUpdate();
		   if(i>0)
		   {
			   System.out.println("inserted successfully");
			   
		   }
		   else {
			   System.out.println("not inserted successfully");
		   }
		   
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		
		
		
		
		
	}
}
