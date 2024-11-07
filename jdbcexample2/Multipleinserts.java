package jdbcexample2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.Date;
public class Multipleinserts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctesting","root","localhost");
		 String query = "insert into first(id, name,date) values(?,?,?)";
		 //PreparedStatement ps = con.prepareStatement(query);
		 for(int i =1; i<=2;i++)
		 {
			 System.out.println("enter id");
			 int id1 = sc.nextInt();
			 System.out.println("enter name");
			 String name1 = sc.next();
			 System.out.println("enter date");
			 String date1 = sc.next();
			 Date d = Date.valueOf(date1);
			 PreparedStatement ps = con.prepareStatement(query);
			 ps.setInt(1, id1);
			 ps.setString(2, name1);
			 ps.setDate(3, d);
			 ps.execute();
			 System.out.println("data inserted");
			 
		 }	
				
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

	}

}
