package com.niit.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.niit.DAO.IUserDAO;
import com.niit.Model.User;
import com.niit.Config.*;

public class UserDAOImpl implements IUserDAO {
	
 
	    
	public Statement stmt=null;


	@Override
	public Boolean insert(User user) throws SQLException {
		ConnectionConfig.createConnection();
	/*	String username;
		String password;
		String fullname;
		String email; */
		String sql = "INSERT INTO User  VALUES (?, ?, ?, ?)";
		 
		PreparedStatement statement = ConnectionConfig.conn.prepareStatement(sql);
		

		
		statement.setString(1,user.getUsername());
		statement.setString(2, user.getPassword());
		statement.setString(3, user.getFullname());
		statement.setString(4, user.getEmail()); 
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		}
		return true;
	}


	@Override
	public Boolean delete(User user) throws SQLException {
		ConnectionConfig.createConnection();
		String sql = "DELETE FROM User WHERE username=?";
		 
		PreparedStatement statement = ConnectionConfig.conn.prepareStatement(sql);
		statement.setString(1, user.getUsername());
		 
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		}
		return true;
	}


	@Override
	public List<User> list() throws SQLException {
		ConnectionConfig.createConnection();
		String sql = "SELECT * FROM User";
		 
		Statement statement = ConnectionConfig.conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 
		int count = 0;
		 
		while (result.next()){
		    String name = result.getString(2);
		    String pass = result.getString(3);
		    String fullname = result.getString("fullname");
		    String email = result.getString("email");
		 
		    String output = "User #%d: %s - %s - %s - %s";
		    System.out.println(String.format(output, ++count, name, pass, fullname, email));
		}
		return null;
	}


	@Override
	public Boolean update(User user) throws SQLException {
		ConnectionConfig.createConnection();
		String sql = "UPDATE User SET password=?, fullname=?, email=? WHERE username=?";
		 
		PreparedStatement statement = ConnectionConfig.conn.prepareStatement(sql);
		statement.setString(1, user.getPassword());
		statement.setString(2, user.getFullname());
		statement.setString(3, user.getEmail());
		statement.setString(4, user.getUsername());
		 
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		}
		return true;
	}

	
	

}
