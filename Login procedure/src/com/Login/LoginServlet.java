package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String username=request.getParameter("username");
	String pwd=request.getParameter("pwd");
	if((username.equals("SVB"))&&(pwd.equals("123")))
	{
		PrintWriter out = response.getWriter();
		RequestDispatcher rd= request.getRequestDispatcher("SuccessServlet");
		rd.forward(request, response);
	}
	else
	{
		PrintWriter out = response.getWriter();
		out.println("<font color='Red'> Oops!! Invalid username and password.</font>");
		RequestDispatcher rd= request.getRequestDispatcher("/Login.html");
		rd.include(request, response);
	}
   	}

}
