package com.az.objectInjection.model;

public class DbUtil {
	
	private Database database;

  public void openConnection() {
	
	System.out.println("URL"+this.database.getUrl());
	System.out.println("User"+this.database.getUser());
	System.out.println("Password"+this.database.getPassword());
	System.out.println("Coonection yaradildi");
	
}

  public void closeConnection() {
	  System.out.println("Connection baglandi.");
  }

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
	
	
	

}
