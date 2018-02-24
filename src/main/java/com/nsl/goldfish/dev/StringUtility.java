package com.nsl.goldfish.dev;



public class StringUtility {
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return addition of two Strings..
	 */
	/*public String addStringS(String s1, String s2) {
		return s1 + s2;
	}*/
public String addStringS(String s1, String s2) {
		if (null==s1)
		{
			return s2;
		}
			return s1 + s2;
	}


	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return concatenation of two Strings
	 */
	/*public String concatenateStrings(String s1, String s2) {
		return s1.concat(s2);
	}*/
public String concatenateStrings(String s1, String s2) {
	if (null==s1) 
	{
		return s2;
	}
		return s1.concat(s2);
	}



	/**
	 * 
	 * @param s1
	 * @return last character
	 */
	/*public char getLastChar(String s1) {
		return s1.charAt(s1.length() - 1);
	}*/
public char getLastChar(String s1) {
	if (null==s1) 
	{
			return Character.MIN_VALUE;
	}
		
     return s1.charAt(s1.length() - 1);
}


	/**
	 * 
	 * @param s1
	 * @return returns first character
	 */
	/*public char getFirstChar(String s1) {
		return s1.charAt(0);
	}*/
public char getFirstChar(String s1) {
		if (null==s1) 
		{
			return  Character.MIN_VALUE;
		}
		
           return s1.charAt(0);
}

	
	/**
	 * 
	 * @param s1
	 * @param index
	 * @return character available at given index
	 */
	/*public char getCharAt(String s1, int index) {
		return s1.charAt(index);
	}*/
public char getCharAt(String s1, int index) {
	if (null==s1) 
	{			
		return  Character.MIN_VALUE;
	}
		
         return s1.charAt(index);
}

	/**
	 * 
	 * @param s1
	 * @return The reverse String
	 */
	/*public String reverseString(String s1) {
		StringBuffer strBuff = new StringBuffer(s1);
		return strBuff.reverse().toString();
	}*/
public String reverseString(String s1) {
	if (null==s1)
	{
		return null;
	}
		StringBuffer strBuff = new StringBuffer(s1);
		return strBuff.reverse().toString();
	}
}




