/**
 * 
 */
package com.sj.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Abridge Solutions
 *
 */
public class DBConnector {
	
	private static DBConnector connector;
	private static Connection con;
	private DBConnector()
	{
		super();
		
		try{  
			Class.forName("org.mariadb.jdbc.Driver");  
		
			 
			}
		catch(Exception e){ System.out.println(e);}  
			  
	
}
public static DBConnector getconnector() {
	if(connector==null)
	{
		connector=new DBConnector();
	}
	return connector;
}

public static Connection getconnection() throws Exception {
	con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/book","root","password");
	return con;
}

}
