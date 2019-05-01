package com.az.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandDao {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public BrandDao(Connection connection) {
		this.connection = connection;
	}

}
