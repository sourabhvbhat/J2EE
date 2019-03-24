package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddDataVV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> error=(List<String>)request.getAttribute("error");
		PrintWriter out= response.getWriter();
		Iterator<String> it= error.iterator();
		out.print("<font color='Red'>");
		String first_name=request.getParameter("first_name");
		String middle_name=request.getParameter("middle_name");
		String last_name=request.getParameter("last_name");
		String dob_d=request.getParameter("dob_d");
		String dob_m=request.getParameter("dob_m");
		String dob_y=request.getParameter("dob_y");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		while(it.hasNext())
		{
			String e= it.next();
		switch(e.charAt(0))
		{
		case 0 :
		
		out.println("<table>" + 
				"	<form action='error.java'>" + 
				"		<tr>" + 
				"			<td> First Name </td>" + 
				"			<td colspan='3'> <input name='first_name' value="+first_name+"> </td>" + 
				"		</tr>" + 
				"		<tr>" + 
				"			<td> Middle Name </td>" + 
				"			<td colspan='3'> <input name='middle_name'value="+middle_name+"> </td>" + 
				"		</tr>" + 
				"		<tr>" + 
				"			<td> Last Name </td>" + 
				"			<td colspan='3'> <input name='last_name' value="+last_name+"> </td>" + 
				"		</tr>" + 
				"		<tr> " + 
				"			<td> Date Of Birth </td>" + 
				"			<td> <input name='dob_d' value="+dob_d+">  </td>" + 
				"			<td> <input name='dob_m' value="+dob_m+">  </td>" + 
				"			<td> <input name='dob_y'value="+dob_y+">  </td>\r\n" + 
				"		</tr>" + 
				"		<tr>" + 
				"			<td> Email ID </td>" + 
				"			<td colspan='3'> <input name='email'value="+email+"> </td>" + 
				"		</tr>" + 
				"			<tr>" + 
				"			<td> Contact Number </td>" + 
				"			<td colspan='3'> <input name='contact' value="+contact+"> </td>" + 
				"		</tr>" + 
				"		<tr>" + 
				"			<td colspan='4'> <input type='submit'></td></tr>" + 
				"		</form>" + 
				"	</table>");
		
	}

		}
	}}
