package com.nsl.foldfish.qa.dbconnection.testcase;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.DBConnection;
import com.nsl.goldfish.dev.DBConnectionManager;

public class TestCasesForDBConnection {
	 static DBConnectionManager dbConnectionManager=null;
	@BeforeMethod
	public void initializer()
	{
		dbConnectionManager=new DBConnectionManager();
	}
	@Test
    public void dbConnectionForValidValues()
	{
	DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
	Assert.assertTrue(result.isConnected(),"Database should successfully login");
	}
	@Test
	public void dbConnectionForInvalidValues()
	{
		DBConnection result=dbConnectionManager.createDbConnection("admin", "admin@123");
		Assert.assertNull(result,"result must be null");
	}
	@Test
	public void dbConnectionForNullValues()
	{
		DBConnection result=dbConnectionManager.createDbConnection(null,null);
		Assert.assertNull(result,"result must be null" );
	}
	@Test
	public void dbConnectionForEmptyString()
	{
		DBConnection result=dbConnectionManager.createDbConnection("","");
		Assert.assertNull(result, "Database login should be fail");
	}
	@Test
	public void dbConnectionForNullAndForOneValue()
	{
		DBConnection result=dbConnectionManager.createDbConnection("","suma");
		Assert.assertNull(result, "Database login should fail");
		
	}
	@Test
	public void executeQueryWithTheNameInTheList()
	{
		DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
		List<String> employeeResult=result.executeQuery("select * from Employee");
		Assert.assertTrue(employeeResult.contains("Suma"));
	}
	@Test
	public void executeQuetyWithTheNameWhichIsNotInTheEmployeeList()
	{
		DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
		List<String> employeeResult=result.executeQuery("select * from Employee");
		Assert.assertFalse(employeeResult.contains("Shruthi")); 
    }
	@Test
	public void executeQueryWithNameInTheList()
	{
		DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
		List<String> employeeResult=result.executeQuery("select * from Employee");
		Assert.assertTrue(employeeResult.contains("Nats"));
	}
	@Test
	public void executeQueryWithPassingNullValue()
	{
		DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
		List<String> employeeResult=result.executeQuery("select * from Employee");
		Assert.assertFalse(employeeResult.contains(null));
	}
	@Test
	public void executeQueryWithPassingEmptyValue()
	{
		DBConnection result=dbConnectionManager.createDbConnection("scott", "tiger");
		List<String> employeeResult=result.executeQuery("select * from Employee");
		Assert.assertFalse(employeeResult.contains(""));
	}
	
	
	
}
