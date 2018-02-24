package com.nsl.goldfish.qa.stringOperation.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.StringUtility;

public class DataProviderForStringOperation {
private static final StringUtility Null = null;
@DataProvider
public Object[][] getDataForAddition()
{
	Object[][] data=new Object[2][3];
	data[0][0]="suma";
	data[0][1]="t";
	data[0][2]="sumat";
	data[1][0]="su";
	data[1][1]="man";
	data[1][2]="suman";
    return data;
}
@DataProvider
public Object[][] getDataForLastChar()
{
	Object[][] data=new Object[1][2];
	data[0][0]="shruthi";
	data[0][1]='i';
	return data;
}
@DataProvider
public Object[][] getDataForFirstChar()
{
	Object[][] data=new Object[1][2];
	data[0][0]="shruthi";
	data[0][1]='s';
	return data;
}
@DataProvider
public Object[][] getDataForCharAt()
{
	Object[][] data=new Object[1][3];
	data[0][0]="shruthi";
	data[0][1]=3;
	data[0][2]='u';
	return data;
}
@DataProvider
public Object[][] getDataForReverseString()
{
	Object[][] data=new Object[1][2];
	data[0][0]="shruthi";
	data[0][1]="ihturhs";
	return data;
}
static StringUtility stringUtility=Null;
@BeforeClass
public void initializer()
{
	StringUtility stringUtility=new StringUtility();
}
@Test(dataProvider="getDataForAddition")
public void addString(String s1,String s2,String expectedOutput)
{
	/*String result= s1+s2;
	Assert.assertEquals(result,ExpectedOutput);
	Assert.assertEquals(result, "suma");
	System.out.println("result");*/
	String result=stringUtility.addStringS(s1,s2);
	Assert.assertEquals(result,expectedOutput);
}
@Test(dataProvider="getDataForLastChar")
public void getLastChar(String s1,char expectedOutput)
{
	
	char result=stringUtility.getLastChar(s1);
	Assert.assertEquals(result, expectedOutput);
}
@Test(dataProvider="getDataForFirstChar")
public void getFirstChar(String s1,char expectedOutput)
{
	char result=stringUtility.getFirstChar(s1);
	Assert.assertEquals(result, expectedOutput);
}
@Test(dataProvider="getDataForCharAt")
public void getCharAt(String s1,int index,char expectedOutput)
{
	
	char result=stringUtility.getCharAt(s1,index);
	Assert.assertEquals(result, expectedOutput);
}
@Test(dataProvider="getDataForReverseString")
public void reverseString(String s1,String expectedOutput)
{


	String result=stringUtility.reverseString(s1);
	Assert.assertEquals(result, expectedOutput);
}

}
