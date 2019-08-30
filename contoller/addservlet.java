package com.sj.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sj.dao.BookDAO;
import com.sj.model.Book;

/**
 * Servlet implementation class Bookservlet
 */
@WebServlet("/Book")
public class addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Book book=new Book();
		BookDAO bookimp = null;
		try {
			bookimp = new BookDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		 book.setId(Integer.parseInt(request.getParameter("id")));
	book.setAuthor(request.getParameter("author"));
	book.setTitle(request.getParameter("title"));
	book.setPrice(Double.parseDouble(request.getParameter("price")));
	try {
		bookimp.Add(book);
		out.println("inserted row");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
