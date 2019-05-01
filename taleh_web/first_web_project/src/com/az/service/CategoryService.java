package com.az.service;

import java.sql.Connection;
import java.util.List;

import com.az.dao.CategoryDao;
import com.az.db.DbUtil;
import com.az.model.Category;

public class CategoryService {

	private CategoryDao categoryDao;
	private Connection connection;

	public List<Category> getListCategory(String lang) {
		List<Category> listCategory = null;

		try {
			connection = DbUtil.getConnection();
			categoryDao = new CategoryDao(connection);
			listCategory = categoryDao.getlistCategory(lang);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listCategory;

	}

}
