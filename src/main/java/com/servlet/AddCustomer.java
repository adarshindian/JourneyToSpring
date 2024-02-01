package com.servlet;

import java.io.IOException;

import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.database.DML;
import com.model.Customer;

/**
 * Servlet implementation class AddCustomer
 */
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String street = request.getParameter("street");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String pass = request.getParameter("pass");

		Customer c = new Customer(fname, lname, street, address, city, state, email, phone, pass);
		DML d = new DML();
		try {
			if (d.isEmailExists(email)) {
				// Redirect to signup page
				RequestDispatcher dd = request.getRequestDispatcher("AddCustomer.jsp");
				dd.forward(request, response);
			} else {
				// Redirect to login page

				int r = d.insertDataToDatabase(c);
				// System.out.print(r);
				if (r == 1) {
					// response.sendRedirect("https://www.google.com/");
					RequestDispatcher db = request.getRequestDispatcher("index.jsp");
					db.forward(request, response);
				} else {
					RequestDispatcher db = request.getRequestDispatcher("error.jsp");
					db.forward(request, response);
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher db = request.getRequestDispatcher("error.jsp");
			db.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher db = request.getRequestDispatcher("error.jsp");
			db.forward(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher db = request.getRequestDispatcher("error.jsp");
			db.forward(request, response);
		}

		System.out.print(c.getFname() + " " + c.getLname());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
