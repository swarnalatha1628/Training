import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class App1 {

	public static void main(String args[]){  
    	
	    try{  
	    	
	    	
	    	String fileLocation ="C:\\Users\\Abridge Solutions\\eclipse-workspace\\PropertyFile\\src\\data.properties";
	    	FileReader reader = new FileReader(fileLocation);
            Properties properties1 = new Properties();
            properties1.load(reader);
            String url=properties1.getProperty("url");
            String user=properties1.getProperty("user");
            String pass=properties1.getProperty("pass");
            Class.forName("org.mariadb.jdbc.Driver"); 
	    	Connection con=DriverManager.getConnection(url,user,pass);  
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

