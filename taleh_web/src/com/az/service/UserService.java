package com.az.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.az.dao.UserDao;
import com.az.db.DbUtil;
import com.az.model.User;

public class UserService {
	Connection connection;
	UserDao userDao;
	DbUtil dbUtil;

	public User registerUser(User user) {
		try {
			connection = dbUtil.getConnection();
			connection.setAutoCommit(false);
			userDao = new UserDao(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int row = userDao.insertUser(user);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return user;

	}



}
