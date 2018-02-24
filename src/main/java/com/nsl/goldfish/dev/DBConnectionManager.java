package com.nsl.goldfish.dev;

import java.util.List;

public class DBConnectionManager {
	DBConnection connection = null;

	public DBConnection createDbConnection(String userName, String password) {

		if (null == userName || null == password) {

			return null;

		} 

		if ("scott".equals(userName) && "tiger".equals(password)) {

			connection = new DBConnection();

			connection.setConnected(true);

			return connection;

		} 	

		return null;	

	}

	

	public void closeConnection() {

		connection = null;

	}

	

	public List<String> executeQuery(String query) {

		return connection.executeQuery(query);

	}

	

}
