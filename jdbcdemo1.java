package jdbcproject;

import java.sql.*;

public class jdbcdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctesting","root","localhost");
				if(con != null)
				{
					System.out.println("success");
					//String query = "insert into first(id, name) values(?,?)";
					//String query = "delete from first where id = ?";
					//String query = "update first set name =? where id = ?";
					String query = "drop table first";
					PreparedStatement ps = con.prepareStatement(query);
					//ps.setInt(1, 2);
					//ps.setString(2,"priya");
					//ps.setString(1,"xyz");
					//ps.setInt(2, 3);
					int i = ps.executeUpdate();
					if(i> 0)
					{System.out.println("success");}
					else
					
					{
						System.out.println("not success");
					}
					
					/*String query = "select * from first";
					PreparedStatement ps = con.prepareStatement(query);
					ResultSet rs = ps.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
					}
					*/
					
					
					
					
					
				}
				else
				{
					System.out.println("not success");
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
