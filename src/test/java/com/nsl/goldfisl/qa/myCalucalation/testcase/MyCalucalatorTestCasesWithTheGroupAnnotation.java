package com.nsl.goldfisl.qa.myCalucalation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.MyCalucalator;

public class MyCalucalatorTestCasesWithTheGroupAnnotation {
	 @Test (groups = { "addition" })
		public void additionOfInteger()
		{
			 MyCalucalator mycalucalator=new MyCalucalator();
			int result= mycalucalator.add(10, 12);
			Assert.assertEquals(result, 22);
		}
		 @Test (groups = { "substraction" })
		 public void substractionOfInteger()
		 {
			 MyCalucalator mycalucalator=new MyCalucalator();
				int result= mycalucalator.sub(10, 12);
				Assert.assertEquals(result, -2);
		 }
		 @Test (groups = { "addition" })
			public void additionOfDouble()
			{
				 MyCalucalator mycalucalator=new MyCalucalator();
				double result= mycalucalator.add(10.5, 12.5);
				Assert.assertEquals(result, 23.0);
			}
		 @Test (groups = { "substraction" })
		 public void substractionOfDouble()
		 {
			 MyCalucalator mycalucalator=new MyCalucalator();
				double result= mycalucalator.sub(2.5, 2.5);
				Assert.assertEquals(result, 0);
		 }
		 

}
