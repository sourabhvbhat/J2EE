package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected String username,password;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		PrintWriter out = response.getWriter();  
		username=request.getParameter("user");
		password=request.getParameter("pwd");
		if((username.equals("svb"))&&(password.equals("123")))
		{
			RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else
		{
			out.println("Oops!! Incorrect username or password");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request,response);
		}
	}

}
