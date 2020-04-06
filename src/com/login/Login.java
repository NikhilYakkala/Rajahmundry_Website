package com.login;
	
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

public class Login extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("uname");
		
		String password = request.getParameter("upassword");
		
		LoginDao logdao = new LoginDao();
		
		if(logdao.check(username, password))
		{
			
			  HttpSession session = request.getSession();
			  
			  session.setAttribute("username", username);
			 
			response.sendRedirect("welcome.jsp");
		}
		else
		{   
            response.sendRedirect("Login.jsp");  
        }  
	}

}
