package com.niit.testcasse;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.DAO.IUserDAO;
import com.niit.DAOImpl.UserDAOImpl;
import com.niit.Model.User;

public class TestUser {

	private static User user;
	private static IUserDAO userDAO;
	private static UserDAOImpl userDAOImpl;
/*	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@BeforeClass
	public static void init()
	{
	
		userDAOImpl=new UserDAOImpl();
	
	}
	/*

@Test
	public void testAddUser() throws SQLException
	{
	user=new User();
		user.setUsername("nandi");
		user.setPassword("pass@123");
		user.setFullname("nandi s");
		user.setEmail("nand@gmail");
		assertEquals("Successfully added a user inside the table!", true, userDAOImpl.insert(user));


		

	} */
	
/*
	@Test
	public void deleteUser() throws SQLException 
	{
		user=new User();
		user.setUsername("nandi");
		assertEquals("Deleteed successfully", true, userDAOImpl.delete(user));
	
	}
	*/
	
	
	@Test
	public void updateUser() throws SQLException 
	{
		user=new User();
		user.setUsername("nandi");
		user.setPassword("niit@123");
		user.setFullname("nandi s");
		user.setEmail("nand@gmail");
		assertEquals("Updated successfully", true, userDAOImpl.update(user));
		}
}

