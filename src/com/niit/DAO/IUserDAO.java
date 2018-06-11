package com.niit.DAO;

import java.sql.SQLException;
import java.util.List;

import com.niit.Model.User;

public interface IUserDAO {
	public Boolean insert(User user)  throws SQLException ;

	public Boolean delete(User user) throws SQLException ;
		
	public Boolean update(User user)throws SQLException;

public List<User> list() throws SQLException;
}
