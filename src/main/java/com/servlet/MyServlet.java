package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.database.DML;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Modi");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getServletPath();
		 System.out.println("Modi in get");
		 response.getWriter().append("Served at: ").append(request.getContextPath());
		 String email=request.getParameter("email");
		 String pass=request.getParameter("pass");
		 System.out.println( email);
		 System.out.println( pass);
		 DML d=new DML();
		 try {
			if(d.validateLogin(email,pass))
			 {
				 RequestDispatcher db=request.getRequestDispatcher("dashboard.jsp");
					db.forward(request, response);
			 }
			 else {
				 RequestDispatcher db=request.getRequestDispatcher("index.jsp");
					db.forward(request, response);
			 }
		} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			RequestDispatcher db=request.getRequestDispatcher("error.jsp");
			db.forward(request, response);
			e.printStackTrace();
		}
			
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Modi in Post");
		doGet(request, response);
	}

}
