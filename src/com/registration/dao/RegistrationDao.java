package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationDao {

	public void registerUser(String firstname, String lastname, String username, String password, String mobilenumber,
			String address) {
		
		try
		{
			String sql = "insert into registration values(?,?,?,?,?,?)";
			
			String url = "jdbc:mysql://localhost:3306/nikhil";
			
			String userName ="root";
			
			String pass = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, userName, pass);
			
			PreparedStatement stmt = con.prepareStatement(sql);
		
			stmt.setString(1, firstname);
		
			stmt.setString(2, lastname);
			
			stmt.setString(3, username);
			
			stmt.setString(4, password);
			
			stmt.setString(5, mobilenumber);
			
			stmt.setString(6, address);
			
			int rs = stmt.executeUpdate();
			
			if(rs>0)
			{
				System.out.println("User Registered Successfully");	
			}
		}
			catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
		
	}

}
