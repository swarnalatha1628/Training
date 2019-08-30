import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Scanner;



public class CustomerDb {
	
	private static Scanner read;
	public static void main(String[] args) throws Exception {
	
	read = new Scanner(System.in);
	Class.forName("org.mariadb.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank","root","password");
	
	Statement stmt=con.createStatement();

	ResultSet rs;

	while(true) {
		
	System.out.println("enter your choice\n1.insert the record\n2.view a record");
	int choice = read.nextInt();
	
	switch(choice)
	{
	case 1:
		
		System.out.println("enter customer id :");
		int customerid = read.nextInt();
		System.out.println("enter customer name :");
		String customername = read.next();
		stmt.executeUpdate("INSERT INTO customers (customerid,customername) "+"VALUES ("+customerid+",'"+customername+"')");
		break;
		
	case 2:
		
		System.out.println("enter customer id :\n");
		int customeridread = read.nextInt();
		int flag=0;
		rs=stmt.executeQuery("select * from customers");  
		
		while(rs.next())  {
			if(rs.getInt(1)==customeridread)
			{
				System.out.println("Customer ID :"+rs.getInt(1));
				System.out.println("Customer Name :"+rs.getString(2));
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("No record found with that ID");
		break;
	
	case 3:
	break;
	
	default:
	System.out.println("Select the correct option");
	}
	}
	}

	}




