package com.nsl.goldfish.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class DataBaseUtility {
	private static Connection connection = null;
	public static Logger LOG = Logger.getLogger(DataBaseUtility.class);
	private static GlobalConfigReader globalConfigReader = GlobalConfigReader.getInstance();

	private static Connection getDBConnection() {
		try {
			Class.forName(globalConfigReader.getDbDriver());
			if (connection == null) {
				connection = DriverManager.getConnection(globalConfigReader.getDbUrl(),globalConfigReader.getDbUserName(),
						globalConfigReader.getDbPassword());
			}

		} catch (Exception e) {
			LOG.debug("Exception while getting DB connection " + e.getMessage());
		}
		return connection;
	}
	
	public List<Map<String,String>> executeAndGetColumnOutput(String sqlQuery) {
		try {
			getDBConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();
			List<Map<String,String>> resultList = new ArrayList<Map<String,String>>();
			while (resultSet.next()) {
				Map<String, String> tempMap  = new HashMap<String, String>();
				for (int i = 1; i < columnCount; i++) {
					tempMap.put(metaData.getColumnName(i), resultSet.getString(metaData.getColumnName(i)) );
				}
				resultList.add(tempMap);
			}
			return resultList;	
		} catch (SQLException e) {
			LOG.debug("Exception whilte Fetching data" + e.getMessage());
			return null;
		}
	}

}
