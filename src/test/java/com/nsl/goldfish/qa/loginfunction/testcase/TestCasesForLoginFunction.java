package com.nsl.goldfish.qa.loginfunction.testcase;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.LoginConstants;
import com.nsl.goldfish.dev.LoginFunction;
import com.nsl.goldfish.dev.ReturnData;


public class TestCasesForLoginFunction {
	static LoginFunction loginFunction=null;
	
	@BeforeMethod
	public void intilizer()
	{
		 loginFunction=new LoginFunction();
	}
	@Test(priority=1)
	public void ReturnDataLoginForInvalidVlaue()
	{
		ReturnData result = loginFunction.login("admin","admin123");
		Assert.assertNotNull("result must not be blank", result);
		Assert.assertFalse("login should be fail", result.getResult());
		Assert.assertEquals("login message should be displayed properly",result.getMessage(),LoginConstants.LOGIN_FAILURE);
		
	}
	@Test(priority=0)
	public void ReturnDataLoginForValidValue()
	{
		ReturnData result = loginFunction.login("Nataraja","Suma");
		Assert.assertNotNull("result must not be blank", result);
		Assert.assertTrue("login should successful", result.getResult());
		Assert.assertEquals("login message should be dispayed properly", result.getMessage(), LoginConstants.LOGIN_SUCCESS);
	}
	@Test(priority=2)
	public void ReturnDataLoginForNull()
	{
		ReturnData result=loginFunction.login(null, null);
		Assert.assertNull("result must be blank", result);
		
	}
	@Test(priority=4)
	public void ReturnDataLoginForOneWithTheNullAndAnotherWithTheValue()
	{
		ReturnData result=loginFunction.login(null, "Suma");
		Assert.assertNotNull("result must not be blank", result);
		Assert.assertFalse("login should be fail", result.getResult());
		Assert.assertEquals("login message should be displayed properly", result.getMessage(), LoginConstants.NO_USERID);
	}
	@Test(priority=3)
	public void ReturnDataLoginForEmpty()
	{
		ReturnData result=loginFunction.login("", "");
		Assert.assertNotNull("result must not be blank", result);
		Assert.assertFalse("login should be null",result.getResult());
	} 
	@Test(priority=5)
	public void ReturnDataForOneNullValueAndAnotherForValue()
	{
		ReturnData result=loginFunction.login("nataraja", null);
		Assert.assertNotNull("result must not be blank", result);
		Assert.assertFalse("login should be fail", result.getResult());
		Assert.assertEquals("login message should be displayed properly", result.getMessage(), LoginConstants.NO_PASSWORD);	
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="Suma";
		data[0][1]="Suma@123";
		data[0][2]="login should be fail";
		data[1][0]="admin";
		data[1][1]="admin123";
		data[1][2]="login should be fail";
		data[2][0]="abc";
		data[2][1]="abc@123";
		data[2][2]="login should be fail";
		return data;
	}

	@Test(dataProvider="getData")
	public void ReturnDataForInvalidValueFromDataProvider(String s1,String s2,String expectedresult)
	{
		ReturnData result=loginFunction.login(s1,s2);
		Assert.assertNotNull("result must not be displayed blank", result);
		Assert.assertFalse("login should be fail", result.getResult());
		Assert.assertEquals("login message should be displayed properly ",result.getMessage(),LoginConstants.LOGIN_FAILURE);
	}
	@Parameters({"s1","s2","expectedResult"})
	@Test
	public void ReturnDataForValidValuesFromParameter(String s1,String s2,String expectedResult)
	{
	   ReturnData result=loginFunction.login(s1, s2);
	   Assert.assertNotNull("result must not be displayed blank", result);
	   Assert.assertTrue("login should be successfull", result.getResult());
	   Assert.assertEquals("login message should be properly displayed",result.getMessage(),LoginConstants.LOGIN_SUCCESS);
	}
}
