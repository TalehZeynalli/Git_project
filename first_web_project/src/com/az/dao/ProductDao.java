package com.az.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.az.model.Brand;
import com.az.model.Category;
import com.az.model.Product;

public class ProductDao {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public ProductDao(Connection connection) {
		this.connection = connection;
	}

	public List<Product> listProducts(String catID, String search, String lang, int limit1, int limit2)
			throws SQLException {
		List<Product> listProducts = new ArrayList<Product>();
		StringBuilder SQL = new StringBuilder(
				"SELECT p.id, p.name,p.image_path, p.price,b.id,b.name,c.id,c.name_" + lang + "");
		SQL.append(" FROM product p ");
		SQL.append(" INNER JOIN brand b ON p.brand_id = b.id ");
		SQL.append(" INNER JOIN category c ON p.cat_id = c.id  WHERE 1=1");

		boolean IsCatIdEmptyOrnull = catID == null || catID.trim().equals("");
		boolean IsSearchEmptyOrnull = search == null || search.trim().equals("");

		if (!IsCatIdEmptyOrnull) {
			SQL.append(" AND c.id=?");

		}
		if (!IsSearchEmptyOrnull) {
			SQL.append(" AND p.name LIKE ?");

		}
		SQL.append(" LIMIT ?,?");

		ps = connection.prepareStatement(SQL.toString());

		if (!IsCatIdEmptyOrnull && !IsSearchEmptyOrnull) {
			ps.setString(1, catID);
			ps.setString(2, search + "%");
			ps.setInt(3, limit1);
			ps.setInt(4, limit2);
		} else if (!IsCatIdEmptyOrnull && IsSearchEmptyOrnull) {
			ps.setString(1, catID);
			ps.setInt(2, limit1);
			ps.setInt(3, limit2);
		} else if (IsCatIdEmptyOrnull && !IsSearchEmptyOrnull) {
			ps.setString(1, search + "%");
			ps.setInt(2, limit1);
			ps.setInt(3, limit2);
		} else {
			ps.setInt(1, limit1);
			ps.setInt(2, limit2);
		}
		rs = ps.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getString(1));
			product.setName(rs.getString(2));
			product.setImagePath(rs.getString(3));
			product.setPrice(rs.getBigDecimal(4));

			Brand brand = new Brand();
			brand.setId(rs.getString(5));
			brand.setName(rs.getString(6));
			product.setBrand(brand);

			Category category = new Category();
			category.setId(rs.getString(7));
			category.setName(rs.getString(8));
			product.setCategory(category);

			listProducts.add(product);

		}
		return listProducts;

	}

	public Product findProductById(String productId, String lang) throws SQLException {
		Product product = null;
		StringBuilder SQL = new StringBuilder(
				"SELECT p.id, p.name,p.image_path, p.price,b.id,b.name,c.id,c.name_" + lang + "");
		SQL.append(" FROM product p ");
		SQL.append(" INNER JOIN brand b ON p.brand_id = b.id ");
		SQL.append(" INNER JOIN category c ON p.cat_id = c.id  WHERE p.id=?");

		ps = connection.prepareStatement(SQL.toString());
		ps.setString(1, productId);
		rs = ps.executeQuery();

		if (rs.next()) {

			product = new Product();
			product.setId(rs.getString(1));
			product.setName(rs.getString(2));
			product.setImagePath(rs.getString(3));
			product.setPrice(rs.getBigDecimal(4));

			Brand brand = new Brand();
			brand.setId(rs.getString(5));
			brand.setName(rs.getString(6));
			product.setBrand(brand);

			Category category = new Category();
			category.setId(rs.getString(7));
			category.setName(rs.getString(8));
			product.setCategory(category);

		}

		return product;

	}

	public int countAllProducts(String catID, String search, int page, int size) throws SQLException {
		StringBuilder SQL = new StringBuilder("Select count(*)");
		SQL.append(" FROM product p");
		SQL.append(" INNER JOIN category c ON p.cat_id = c.id  WHERE 1=1");

		boolean IsCatIdEmptyOrnull = catID == null || catID.trim().equals("");
		boolean IsSearchEmtyOrnull = search == null || search.trim().equals("");


		if (!IsCatIdEmptyOrnull) {
			SQL.append(" AND c.id=?");
		}
		if (!IsSearchEmtyOrnull) {
			SQL.append(" AND p.name LIKE ?");
		}

		ps = connection.prepareStatement(SQL.toString());

		if (!IsCatIdEmptyOrnull && !IsSearchEmtyOrnull) {
			ps.setString(1, catID);
			ps.setString(2, search + "%");
		} else if (!IsCatIdEmptyOrnull && IsSearchEmtyOrnull) {
			ps.setString(1, catID);
		} else if (IsCatIdEmptyOrnull && !IsSearchEmtyOrnull) {
			ps.setString(1, search + "%");
		}
		rs = ps.executeQuery();
		int count = 0;
		if (rs.next()) {
			count = rs.getInt(1);
		}

		return count;

	}

}
