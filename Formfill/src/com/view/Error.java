package com.view;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String email;
	public Error() {
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	String first_name =request.getParameter("first_name");
	String contact =request.getParameter("contact");
	String middle_name =request.getParameter("middle_name");
	String last_name =request.getParameter("last_name");
	email =request.getParameter("email");
	String dob_y=request.getParameter("dob_y");
	List <String> error = new LinkedList<String>();
	if(first_name == null || middle_name==null || last_name==null || contact==null || email==null)	
	{
		error.add("First Name cannot be empty");
	}
	if(first_name.length()<=4 || middle_name.length()<=4 || last_name.length()<=4)
	{
		error.add("Name should have atleast 4 characters");
	}
	
	if(Integer.parseInt(dob_y)>=2000)
	{
		error.add("Age should be minimum of 18");
	}
	if(contact.length()>=10)
	{
		error.add("Phone number should have atleast 10 characters");
	}
	RequestDispatcher res=request.getRequestDispatcher("AddDataVV");
	request.setAttribute("error", error);
	res.forward(request, response);
	
}
private boolean isValid(String email2) {
	{ 
	    String emailRegex = "^[0-9 a-z A-Z ]*[\\^.]  @ [A-Z a-z ]{2,10}   [\\.] {1} [A-Z a-z ]{2,7} $";                       
	    Pattern pat = Pattern.compile(emailRegex); 
	    if (email == null) 
	        return false; 
	    return pat.matcher(email).matches(); 
	} 

	}

}
