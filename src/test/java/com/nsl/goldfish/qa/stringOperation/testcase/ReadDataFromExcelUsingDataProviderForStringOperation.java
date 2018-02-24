/*package com.nsl.goldfish.qa.feature5.testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.StringUtility;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadDataFromExcelUsingDataProvider {
	
	@Test(dataProvider="getData")
	public void additionForTwoString(String str1,String str2,String exceptedResult)
	{
		StringUtility stringUtility=new StringUtility();
		String result=stringUtility.addStringS(str1, str2);
		Assert.assertEquals(result,exceptedResult );
	}
	@DataProvider
	public Object[][] getData() throws IOException, BiffException 
	{
		Object[][] data=getExcelData("D:\\javapg\\Book1.xls","sheet1");
		return data;		
	}
	public String[][] getExcelData(String Filename,String SheetName) throws IOException, BiffException
	{
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(Filename);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(SheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			} 
		
		return arrayExcelData;
	}
		

	}*/

package com.nsl.goldfish.qa.stringOperation.testcase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.nsl.goldfish.dev.StringUtility;
import com.nsl.goldfish.qa.GoldFishTestHelpher;


public class ReadDataFromExcelUsingDataProviderForStringOperation extends GoldFishTestHelpher  {
	static StringUtility stringUtility=null;
	@BeforeMethod
	public void Initializer()
	{
	     stringUtility=new StringUtility();
	}
	@Test(dataProvider="getDataForAdditionAndConcatenation")
    public void additionForTwoString(String str1,String str2,String exceptedResult)
    {
        String result=stringUtility.addStringS(str1, str2);
        Assert.assertEquals(result,exceptedResult );
    }
	@Test(dataProvider="getDataForAdditionAndConcatenation")
	public void concatenateOfTwoString(String str1,String str2,String expectedResult)
	{
		String result=stringUtility.concatenateStrings(str1, str2);
		Assert.assertEquals(result, expectedResult);
	}
	@Test(dataProvider="getDataForLastCharacter") 
	public void getLastChar(String str,String expectedResult)
	{
		char result=stringUtility.getLastChar(str);
		Assert.assertEquals(result, expectedResult.charAt(0));
	}
	@Test(dataProvider="getDataForFirstCharacter")
	public void getFirstChar(String str,String expectedResult)
	{
		char result=stringUtility.getFirstChar(str);
		Assert.assertEquals(result, expectedResult.charAt(0));
		
	}
	@Test(dataProvider="getDataForCharAt")
	public void getCharAt(String str,String index,String expectedResult)
	{
		int i=Integer.parseInt(index);
		char result=stringUtility.getCharAt(str,i);
		Assert.assertEquals(result, expectedResult.charAt(0));
	}
	@Test(dataProvider="getDataForreverseString")
	public void reverseString(String str,String expectedResult)
	{
		String result=stringUtility.reverseString(str);
		Assert.assertEquals(result, expectedResult);
	}
	@DataProvider
    public Object[][] getDataForAdditionAndConcatenation() throws IOException 
    {
		Object[][] data=excelDataUtility.getExcelData("/TestData/StringOperation/additionAndConcatenation.xls","Sheet1");
         return data;		
     }
	@DataProvider
	public Object[][] getDataForLastCharacter() throws IOException
	{
		Object[][] data=excelDataUtility.getExcelData("/TestData/StringOperation/GetChar.xls", "Sheet1");
		return data;
	}
	@DataProvider
	public Object[][] getDataForFirstCharacter() throws IOException
	{
		Object[][] data=excelDataUtility.getExcelData("/TestData/StringOperation/GetFirstChar.xls","Sheet1");
		return data;
	}
	@DataProvider
	public Object[][] getDataForCharAt() throws IOException
	{
		Object[][] data=excelDataUtility.getExcelData("/TestData/StringOperation/GetCharAt.xls","Sheet1");
		return data;
	}
	@DataProvider
	public Object[][] getDataForreverseString() throws IOException
	{
		Object[][] data=excelDataUtility.getExcelData("/TestData/StringOperation/reverseString.xls","Sheet1");
		return data;
	}
	
}

