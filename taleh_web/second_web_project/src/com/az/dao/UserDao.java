package com.az.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.az.model.User;

public class UserDao {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public UserDao(Connection connection) {
		this.connection = connection;
	}

	

	


	public int insertUser(User user) throws SQLException {
		ps = connection.prepareStatement("INSERT INTO user VALUES (?,?,?,?,?)");
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getName());
		ps.setString(4, user.getSurname());
		ps.setInt(5, user.getAge());
		

		int row = ps.executeUpdate();

		return row;
	}

}
