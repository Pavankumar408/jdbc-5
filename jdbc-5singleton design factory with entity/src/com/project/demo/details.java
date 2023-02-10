package com.project.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.customerentity.customers1;
import com.project.util.Connectionprovider;

public class details implements customers {

	@Override
	public void savedata(customers1 customers) {
		System.out.println("details.savedata()");
		String insertQuery="insert into customers value(?,?,?,?,?)";
	try {
		Connection connection=Connectionprovider.getconnection();
		PreparedStatement statement=connection.prepareStatement(insertQuery);
		statement.setInt(1, customers.getSlno());
		statement.setString(2, customers.getName());
		statement.setString(3,customers.getGender());
		statement.setInt(4, customers.getAge());
		statement.setInt(5, customers.getSalary());
		statement.executeUpdate();
		System.out.println("data is saved sucessfully");
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	finally {
		Connectionprovider.closeconnection();	}
	
	
	
	}

	@Override
	public void updategender(customers1 customers) {
		System.out.println("details.updategender()");
		String updategender="update customers set gender=? where slno=?";
	try {
		Connection connection=Connectionprovider.getconnection();
		PreparedStatement statement=connection.prepareStatement(updategender);
		statement.setString(1,customers.getGender());
		statement.setInt(2, customers.getSlno());
		statement.executeUpdate();
		System.out.println("data is updated sucessfully");
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
finally {
	Connectionprovider.closeconnection();
		
	}
	
	
	
	}
	@Override
public void deletedata(customers1 customers) {
		System.out.println("details.deletedata()");
		String deletedata="delete from customers where slno = ?";
		try {
			Connection connection=Connectionprovider.getconnection();
		PreparedStatement statement=connection.prepareStatement(deletedata);
		statement.setInt(1, customers.getSlno()); 
		statement.executeUpdate(deletedata);
	
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Connectionprovider.closeconnection();
		}
		
	}

	@Override
	public void updatealldata(customers1 customers) {
		System.out.println("details.updatealldata()");
		String updatealldata="update customers set slno=?,name=?, gender=?,age=?,salary=?";
		try {
			Connection connection=Connectionprovider.getconnection();
			PreparedStatement statement=connection.prepareStatement(updatealldata);
			statement.setInt(1, customers.getSlno());
			statement.setString(2, customers.getName());
			statement.setString(3, customers.getGender());
			statement.setInt(4, customers.getAge());
			statement.setInt(5, customers.getSalary());
			statement.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Connectionprovider.closeconnection();
		}
	}}
	

	
	



