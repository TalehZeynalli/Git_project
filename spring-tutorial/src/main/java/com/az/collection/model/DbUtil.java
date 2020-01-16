package com.az.collection.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DbUtil {

	private String username;

	private String password;

	private List<String> list;

	private Map<String, String> map;

	private Properties properties;

	public void openConeection() {
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);

		System.out.println("List deyisenleri:");

		for (String lists : list) {
			System.out.println("\t" + lists);
			}
			
			System.out.println("Map deyisenleri");

		for (String maps : map.keySet()) {
				System.out.println(maps+":"+ map.get(maps));

			}

			System.out.println("Properties deyisenleri:");

	    for (String props : properties.stringPropertyNames()) {
				System.out.println("\t" + properties.getProperty(props));

			}

		
	}

	public void closeConnection() {

		System.out.println("Connection bagandi");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
