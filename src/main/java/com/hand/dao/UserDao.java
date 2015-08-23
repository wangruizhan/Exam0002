package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.entity.Customer;

public interface UserDao {
	
//	public void save(Connection conn,User user)throws SQLException;
//	public void update(Connection conn,Long id,User user)throws SQLException;
//	public void delete(Connection conn,User user)throws SQLException;
	
	public ResultSet get(Connection conn,Customer customer)throws SQLException;
}
