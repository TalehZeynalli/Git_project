package com.az.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.az.dao.ProductDao;
import com.az.db.DbUtil;
import com.az.model.Product;

public class ProductService {

	private ProductDao productDao;
	private Connection connection;

	public List<Product> getListProduct(String catID, String search, String lang, int page, int size) {
		List<Product> listProduct = null;

		try {
			connection = DbUtil.getConnection();
			productDao = new ProductDao(connection);
			int count=productDao.countAllProducts(catID, search,page, size);
			
			if (size==0) {
				size=6;
				
			}
			int limit1=0;
			if (page!=0) {
				
		    limit1=(page-1)*size;
		    
			}
			
			
			
			listProduct = productDao.listProducts(catID, search, lang,limit1,size);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return listProduct;
		
	}
	public double countPageInation( String catID, String search,int page, int size) {
		int countpageination=1;

		try {
			connection = DbUtil.getConnection();
			productDao = new ProductDao(connection);
			if (size==0) {
				size=6;
				
			}
			int limit1=0;
			if (page!=0) {
				
		    limit1=(page-1)*size;
		    
			}
			
			 int count = productDao.countAllProducts(catID, search,page,size);
			 countpageination=(int) Math.ceil(count/(double)size);
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
				
		return countpageination;
	    }
		
	public Product findProductById(String productId,String lang) {
		Product product = null;

		try {
			connection = DbUtil.getConnection();
			productDao = new ProductDao(connection);
			product = productDao.findProductById(productId,lang);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return product;
	}

}
