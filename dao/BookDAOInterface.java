package com.sj.dao;

import java.util.ArrayList;

import com.sj.model.Book;

public interface BookDAOInterface   {
	public void Add(Book book) throws Exception ;
	public Book display(int id) throws Exception;
	public ArrayList<Book> displayAll() throws Exception;
	public void update(int id,double price) throws Exception;
	public void delete(int id) throws Exception;
}
