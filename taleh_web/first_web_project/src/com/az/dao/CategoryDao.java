package com.az.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.az.model.Category;

public class CategoryDao {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public CategoryDao(Connection connection) {
		this.connection = connection;
	}

	public List<Category> getlistCategory(String lang) throws SQLException {
		List<Category> listCategories = new ArrayList<Category>();
		ps = connection.prepareStatement("SELECT c.id,c.name_" + lang + " FROM category c");
		rs = ps.executeQuery();

		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			Category cat = new Category(id, name);
			listCategories.add(cat);

		} 
		return listCategories;
	}
}