package com.nsl.goldfish.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class GlobalConfigReader {
	private static GlobalConfigReader instance = null;
	private static Logger LOG = Logger.getLogger(GlobalConfigReader.class);
	private static Properties prop = null;
	private GlobalConfigReader() {};
	
	public static GlobalConfigReader getInstance () {
		if(null == instance) {
			InputStream inStream = GlobalConfigReader.class.getResourceAsStream("/GlobalConf.properties");
		    prop = new Properties();
			try {
				prop.load(inStream);
			} catch (IOException e) {
				LOG.debug("Exception while reading Global Configuration propeties");
			}
			instance = new GlobalConfigReader();
		}
		return instance;
	}
	
	public String getDbType() {
		return prop.get("db.type") != null ? prop.get("db.type").toString() : null;
	}
	
	public String getDbDriver() {
		return prop.get("db.driver") != null ? prop.get("db.driver").toString() : null;
	}
	
	public String getDbUrl() {
		return prop.get("db.url") != null ? prop.get("db.url").toString() : null;
	}
	
	public String getDbUserName() {
		return prop.get("db.username") != null ? prop.get("db.username").toString() : null;
	}
	
	public String getDbPassword() {
		return prop.get("db.password") != null ? prop.get("db.password").toString() : null;
	}

}
