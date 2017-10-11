package com.nsl.goldfish.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;

public class DataBaseUtility {
	private static Connection connection = null;
	public static Logger LOG = Logger.getLogger(DataBaseUtility.class);
	private static GlobalConfigReader globalConfigReader = GlobalConfigReader.getInstance();

	private static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection(globalConfigReader.getDbDriver());
			}

		} catch (Exception e) {
			LOG.debug("Exception while getting DB connection " + e.getMessage());
		}
		return connection;
	}
	
	public static void executeAndGetColumnOutput(String sqlQuery) {
		
	}

}
