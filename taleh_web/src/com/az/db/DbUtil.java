package com.az.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DbUtil {

	static {
		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/taleh", "root", "taleh");
		return connection;
	}

	public static void closeConnection(Connection connection) throws SQLException {
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}

}
