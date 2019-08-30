package com.sj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sj.model.Book;


public class BookDAO implements BookDAOInterface {
	Connection con;
	public BookDAO() throws Exception{
	DBConnector.getconnector();
	con=DBConnector.getconnection();
	}
	public void Add(Book book) throws Exception 
	{
		 String query = "insert into book values(?,?,?,?)";
	      PreparedStatement preparedStmt = con.prepareStatement(query);
	      preparedStmt.setInt(1,book.getId());
	      preparedStmt.setString(2, book.getTitle());
	      preparedStmt.setString(3,book.getAuthor());
	      preparedStmt.setDouble(4, book.getPrice());
	      preparedStmt.executeUpdate();
	}
	public Book display(int id) throws Exception {
        Statement stmt=con.createStatement(); 
		Book book = new Book();
		ResultSet rs;
		 rs=stmt.executeQuery("select * from book");  
		 while(rs.next())  {
				if(rs.getInt(1)==id)
				{
					
					book.setId(rs.getInt(1));
					book.setAuthor(rs.getString(2));
					book.setTitle(rs.getString(3)); 
					book.setPrice(rs.getDouble(4));
					
				}
			}
		return book;
			
	}
	public ArrayList<Book> displayAll() throws Exception {
		Statement stmt=con.createStatement(); 
		ArrayList<Book> bookArray=new ArrayList<Book>();
		
		ResultSet rs;
		 rs=stmt.executeQuery("select * from book");  
		while(rs.next()) {
			try { 
				Book book=new Book();
			book.setId(rs.getInt(1));
			book.setAuthor(rs.getString(2));
			book.setTitle(rs.getString(3)); 
			book.setPrice(rs.getDouble(4));
			bookArray.add(book);
			}
		catch(Exception e)
			{ 
				System.out.println(e);
			}  
			}  
		System.out.println(bookArray);
		return bookArray;
	}
	
	public void update(int id,double price) throws Exception
	{
		Statement stmt=con.createStatement(); 
		Book book = new Book();
		ResultSet rs;
		 rs=stmt.executeQuery("select * from book");  
		 while(rs.next())  {
				if(rs.getInt(1)==id)
				{
					
					book.setId(rs.getInt(1));
					
				}
			}
		String query = "update book set price = ? where id = ?";
	      PreparedStatement preparedStmt = con.prepareStatement(query);
	      preparedStmt.setDouble(1,price);
	      preparedStmt.setInt(2, book.getId());
	      preparedStmt.executeUpdate();
	}
	public void delete(int id) throws Exception
	{
		Statement stmt=con.createStatement(); 
		Book book = new Book();
		ResultSet rs;
		 rs=stmt.executeQuery("select * from book");  
		 while(rs.next())  {
				if(rs.getInt(1)==id)
				{
					
					book.setId(rs.getInt(1));
					
				}
			}
		String query = "delete from book where id= ?";
	      PreparedStatement preparedStmt = con.prepareStatement(query);
	      preparedStmt.setInt(1, book.getId());
	      preparedStmt.executeUpdate();
		
	}
	
}
