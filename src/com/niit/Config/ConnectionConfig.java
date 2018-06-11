package com.niit.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionConfig {
//	public static final String DATABASE_URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	/*public static final String DATABASE_URL="org.h2.Driver";
	public static final String DATABASE_DRIVER="oracle.jdbc.driver.OracleDriver";
		public static final String DATABASE_USERNAME="nandini";
	public static final String DATABASE_PASSWORD="pass@123"; */
	
	
	    public static Connection conn = null;
 
	    


	    public static void createConnection()
	    {
	        try
	        {
	            Class.forName("org.h2.Driver").newInstance();
	            //Get a connection
	            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa",""); 
	        }
	        catch (Exception except)
	        {
	            except.printStackTrace();
	        }
	    }

}

