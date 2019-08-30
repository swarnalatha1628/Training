import java.util.*;
import java.sql.*; 
public class JDBCDemo {
     
     
    public static void main(String args[]){  
    	
    try{  
    	
    	Class.forName("org.mariadb.jdbc.Driver");  
    	Connection con=DriverManager.getConnection(  
    			"jdbc:mariadb://localhost:3306/bank","root","password");  
    	//here bank is database name, root is username and password is password  
    	
    	Statement stmt=con.createStatement();  
    	ResultSet rs=stmt.executeQuery("select * from employee");  
    	
    	while(rs.next())  
    		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
    	
        con.close();  
        
    }catch(Exception e)
    { System.out.println(e);}  
    }  
  } 



