package com.registration;
	
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.dao.RegistrationDao;

public class Registration extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
	
		String firstname = request.getParameter("fname");
		
		String lastname = request.getParameter("lname");
		
		String username = request.getParameter("uname");
		
		String password = request.getParameter("upassword");
		
		String mobilenumber = request.getParameter("mobilenumber");
		
		String address = request.getParameter("address");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil",
	            "root", "root");
	    
	    Statement st = con.createStatement();
	    
	    int i = st.executeUpdate("insert into registration values ('" + firstname + 
	    		 "','" + lastname + "','" + username + "','" + password + "','" + 
	    		 mobilenumber + "','" + address+ "')"); 
	    
	    if (i > 0) 
	    {
	        response.sendRedirect("Login.jsp");    
	    } 
	    else 
	    {
	        response.sendRedirect("Registration.jsp");
	    }
		}
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
		
		/*
		 * RegistrationDao regdao = new RegistrationDao();
		 * 
		 * if(firstname.isEmpty()||lastname.isEmpty()||username.isEmpty()||
		 * password.isEmpty()||mobilenumber.isEmpty()||address.isEmpty()) {
		 * response.sendRedirect("Registration.jsp"); } else {
		 * regdao.registerUser(firstname,lastname,username,password,mobilenumber,address
		 * ); }
		 */
	}
}
