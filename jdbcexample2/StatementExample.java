package jdbcexample2;

import java.sql.*;
import java.sql.Date;
public class StatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","localhost");
			
			Statement stmt = con.createStatement();
			
		  String d = "2024-12-03";
		 // Date d2 = Date.valueOf(d);
			int i = stmt.executeUpdate("insert into first values(1,'palakrai','2024-12-03') ");
			
			//stmt.executeUpdate("drop table first");
			//System.out.println("sucess");
			if(i > 0) 
			{System.out.println("success");}
			
			else {System.out.println("not success");}
			
			ResultSet rs = stmt.executeQuery("select * from first");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " "+ rs.getString(2) + ""+rs.getString(3));
				
			}
			
			
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
