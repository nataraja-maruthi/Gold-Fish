package com.nsl.goldfish.dev;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
	
	private static boolean isConnected;



	public  boolean isConnected() {

		return isConnected;

	}



	public  void setConnected(boolean connected) {

		isConnected = connected;

	}

	

	

	public List<String> executeQuery(String query) {

		List<String> list = new ArrayList<String>();

		if (null!=query && query.contains("Employee")) {

			list.add("Nats");

			list.add("Suma");

			list.add("Giri");

			return list;

		}

		return list;

	}

}
