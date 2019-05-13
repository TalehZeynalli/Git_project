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

	public User findUserByUsernameAndPassword(String username, String password) throws SQLException {
		ps = connection.prepareStatement("SELECT * FROM user u WHERE u.username = ? AND u.password = ?");
		ps.setString(1, username);
		ps.setString(2, password);

		rs = ps.executeQuery();

		if (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));

			return user;
		}

		return null;
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
