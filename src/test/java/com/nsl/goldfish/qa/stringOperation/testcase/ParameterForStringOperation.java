package com.nsl.goldfish.qa.stringOperation.testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.StringUtility;

import junit.framework.Assert;

public class ParameterForStringOperation {
	
	/*@Parameters({"s1"})
	@Test
	public void parameterTest(String s1)
	{
		System.out.println("the parameter name is:- "+s1);
		
	}
	@Parameters({"s2"})
	@Test
	public void parameterTest1(String s2)
	{
		System.out.println("the parameter name is:- "+s2);
		
	}*/
	@Parameters({"str1","str2","expectedResult"})
	@Test
	public void parameterTestForStringAddition(String str1,String str2,String expectedResult)
	{
		StringUtility stringUtility=new StringUtility();
		String result=stringUtility.addStringS(str1,str2);
		Assert.assertEquals(result, expectedResult);
		System.out.println("the parameter for s1 passed as:- "+result);
		System.out.println("the parameter for expectedResult passed as:- "+expectedResult);
	}
	@Parameters({"str1","expectedResult"})
	@Test
	public void parameterTestForGetLastChar(String str1,char expectedResult)
	{
		StringUtility stringUtility=new StringUtility();
		char result=stringUtility.getLastChar(str1);
		Assert.assertEquals(result, expectedResult);
		System.out.println("the parameter for str1 is:-"+result);
		System.out.println("the parameter for expectedResult is:- "+expectedResult);
	}
	/*@Test
	public static void testAddition() {
		StringUtility strUtil = new StringUtility();
		String result = strUtil.addStringS("suma", "T");
		Assert.assertEquals(result, "SumaT");
	}*/
	
}
