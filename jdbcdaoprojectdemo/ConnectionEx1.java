package jdbcdaoprojectdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEx1
{
    static  Connection getCon()
    {
    	Connection con = null;
    	try
    	{
       Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","localhost");
       
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return con;
    }
	
	
}
