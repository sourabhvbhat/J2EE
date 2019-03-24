package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		float sum,a,b;
		a=Float.parseFloat(request.getParameter("fn"));
		b=Float.parseFloat(request.getParameter("sn"));
		sum=a+b;
		PrintWriter out = response.getWriter();
		out.println("<form><table>"
				+"<tr><td> First Number: </td><td> <input type='text' name='fn' value="+a+"></td></tr>"+
				"<tr><td> Second Number: </td><td> <input type='text' name='sn' value="+b+"></td></tr>"+
				"<tr><td><input type='submit' value='Add'></td><td> <input type='reset' value='Delete'> </td></tr>"+
				"<tr><td> Sum: </td><td> <input type='text' name='fn' value="+sum+"> </td></tr>"	
				+"</table></form>");
	}

}
