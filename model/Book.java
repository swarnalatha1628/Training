/**
 * 
 */
package com.sj.model;

/**
 * @author Abridge Solutions
 *
 */
public class Book {
	
	public int id;
	String Title;
	String author;
	double price;

	public Book() {
		super();
		
	}
	public Book(int id,String title,String author,double price)
	{
	super();
	this.id=id;
	this.Title=title;
	this.author=author;
	this.price=price;
	}
	public int getId() {
	return id;	
	}
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setId(int id) {
	this.id=id;	
	}
	public void setTitle(String title) {
		this.Title=title;
	}

	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}


}
