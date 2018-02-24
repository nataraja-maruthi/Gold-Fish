package com.nsl.goldfish.qa.stringOperation.testcase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nsl.goldfish.dev.StringUtility;

public class TestingStringUtility {
static StringUtility stringUtility=null;
	@BeforeClass(alwaysRun=true)
	public void intilizer()
	{
		stringUtility=new StringUtility();
 	}
	@Test (groups = {"addition"})
	public void additionOfTwoString()
	{
		String result=stringUtility.addStringS("su", "na");
		Assert.assertEquals(result, "suna");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoNull() 
	{
		String result=stringUtility.addStringS(null,null);
		Assert.assertNull(null);
	}
	@Test (groups = {"addition"})
	public void additionOfTwoEmptyString()
	{
		String result=stringUtility.addStringS("","");
		Assert.assertEquals(result, "");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoUppercaseString()
	{
		String result=stringUtility.addStringS("SHRU","THI");
		Assert.assertEquals(result, "SHRUTHI");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoCamelcaseString()
	{
		String result=stringUtility.addStringS("SuMa","NaTaRaJa");
		Assert.assertEquals(result, "SuMaNaTaRaJa");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoStringsWithSpecialCharacters()
	{
		String result=stringUtility.addStringS("suma@#$","uy&>?");
		Assert.assertEquals(result, "suma@#$uy&>?");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoStringswithNumbers()
	{
		String result=stringUtility.addStringS("suma123","uy2356");
		Assert.assertEquals(result, "suma123uy2356");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoStringsWithSpaceBetweenString()
	{
		String result=stringUtility.addStringS("su ma","um ma");
		Assert.assertEquals(result, "su maum ma");
	}
	@Test (groups = {"addition"})
	public void additionOfTwoStringsWithOneNullAndOneString()
	{
		String result=stringUtility.addStringS(null,"um ma");
		Assert.assertEquals(result, "um ma");
	}
	@Test (groups = {"concat"})
	public void concatenatenationOfTwoStrings()
	{
		String result=stringUtility.concatenateStrings("su","ma");
		Assert.assertEquals(result, "suma");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoNullString()
	{
		String result=stringUtility.concatenateStrings(null,null);
		Assert.assertNull(null);
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoEmptyString()
	{
		String result=stringUtility.concatenateStrings("","");
		Assert.assertEquals(result, "");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoStringWithTheSpecialCharacter()
	{
		String result=stringUtility.concatenateStrings("su^&*","jk*&^");
		Assert.assertEquals(result, "su^&*jk*&^");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoStringWithNumbers()
	{
		String result=stringUtility.concatenateStrings("su123","jk456");
		Assert.assertEquals(result, "su123jk456");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoStringWithSpaceInBetweenThem()
	{
		String result=stringUtility.concatenateStrings("su ma","shru thi");
		Assert.assertEquals(result, "su mashru thi");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoUppercaseString()
	{
		String result=stringUtility.concatenateStrings("SUMA","GIRI");
		Assert.assertEquals(result, "SUMAGIRI");
	}
	@Test (groups = {"concat"})
	public void concatenationOfTwoCamelcaseString()
	{
		String result=stringUtility.concatenateStrings("SuMa","ShRuThI");
		Assert.assertEquals(result, "SuMaShRuThI");
	}
	@Test (groups = {"get"})
	public void getLastCharacter()
	{
		char result=stringUtility.getLastChar("suma");
		Assert.assertEquals(result, 'a');	
	}
	@Test (groups = {"get"})
	public void getLastCharacterWithNumbers()
	{
		char result=stringUtility.getLastChar("su12ma34");
		Assert.assertEquals(result, '4');	
	}
	@Test (groups = {"get"})
	public void getLastCharacterWithSpecialCharacter()
	{
		char result=stringUtility.getLastChar("%^su^*ma%$");
		Assert.assertEquals(result, '$');	
	}
	@Test (groups = {"get"})
	public void getLastCharacterwithNull()/*It is not working*/
	{
		char result=stringUtility.getLastChar(null);
		Assert.assertEquals(result, Character.MIN_VALUE);
	}
	@Test (groups = {"get"})
	public void getLastCharacterWithUpperCaseString()
	{
		char result=stringUtility.getLastChar("SHRUTHI");
		Assert.assertEquals(result, 'I');	
	}
	@Test(groups = {"first"})
	public void getFirstCharacter()
	{
		char result=stringUtility.getFirstChar("suma");
		Assert.assertEquals(result, 's');
	}
	@Test (groups = {"first"})
	public void getFirstCharacterWithNull()
	{
			char result=stringUtility.getFirstChar(null);
			Assert.assertEquals(result, Character.MIN_VALUE);
	}
	@Test (groups = {"first"})
	public void getFirstCharacterWithNumber()
	{
		char result=stringUtility.getFirstChar("123suma");
		Assert.assertEquals(result, '1');
	}
	@Test (groups = {"first"})
	public void getFirstCharacterWithSpecialCharacter()
	{
		char result=stringUtility.getFirstChar("#$%suma&**");
		Assert.assertEquals(result, '#');
	}
	@Test (groups = { "at"})
	public void getCharAt()
	{
		char result=stringUtility.getCharAt("suma",1);
		Assert.assertEquals(result, 'u');	
	}
	@Test (groups = { "at"})
	public void getCharAtNull()
	{
		char result=stringUtility.getCharAt(null,0);
		Assert.assertEquals(result, Character.MIN_VALUE);
    }
	@Test (groups = { "at"})
	public void getCharAtWithSpaceString()
	{
		char result=stringUtility.getCharAt("suu  maa",3);
		Assert.assertEquals(result, 'm');	
	}
	@Test (groups = {"reverse"})
	public void reverseOfString()
	{
		String result=stringUtility.reverseString("suma");
		Assert.assertEquals(result, "amus");	
	}
	@Test (groups = {"reverse"})
	public void reverseOfStringWithNumbers()
	{
		String result=stringUtility.reverseString("suma12345");
		Assert.assertEquals(result, "54321amus");	
	}
	@Test (groups = {"reverse"})
	public void reverseOfStringWithUppercase()
	{
		String result=stringUtility.reverseString("SHRUTHI");
		Assert.assertEquals(result, "IHTURHS");	
	}
	@Test (groups = {"reverse"})
	public void reverseOfStringWithSpecialchracters()
	{
		String result=stringUtility.reverseString("suma%^&*");
		Assert.assertEquals(result, "*&^%amus");	
	}
	@Test (groups = {"reverse"})
	public void reverseOfStringWithSpace()
	{
		String result=stringUtility.reverseString("su   ma");
		Assert.assertEquals(result, "am   us");	
	}
	@Test (groups = {"reverse"})
	public void reverseOfStringWithNull()
	{
		String result=stringUtility.reverseString(null);
		Assert.assertEquals(result,null);
	}
}
