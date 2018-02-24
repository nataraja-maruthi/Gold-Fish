package com.nsl.goldfisl.qa.myCalucalation.testcase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.MyCalucalator;
import com.nsl.goldfish.qa.GoldFishTestHelpher;

public class MyCalucalatorWithTheTestNGAnnotation   {
	static MyCalucalator calucalator=null;
	
	@BeforeClass
	public static void initialize()
	{
       calucalator=new MyCalucalator();
	}
	@AfterMethod
	public static void print()
	{
		System.out.println("Hello");
	}
	@BeforeMethod
	public static void print2()
	{
		System.out.println("Hi");
	}
	@Test(priority=2)
	public static void additionOfIntegerNumber() {
	
		int result= calucalator.add(5, 6);
		Assert.assertEquals(11, result);
		System.out.println("additionofIntegerNumber");
	}

	@Test(priority=3)
	public static void additionOfDoubleNumber() {
		
		double result= calucalator.add(1.5, 1.5);
		Assert.assertEquals(3.0,result);
		System.out.println("additionofdoublenumber");
	}
	@Test(enabled=false)
	public static void substractionOfIntegerNumber()
	{
	  int result=calucalator.sub(5, 8);
	  Assert.assertEquals(result,-3,"substractionofInteger");
	  System.out.println("substractionofintegernumber");
	}
	@Test(priority=1)
	public static void substractionOfDoubleNumber()
	{
		double result=calucalator.sub(2.5, 3.5);
		Assert.assertEquals(-1.0, result);
		System.out.println("substractionofdoublenumber");
	}	
	
}
