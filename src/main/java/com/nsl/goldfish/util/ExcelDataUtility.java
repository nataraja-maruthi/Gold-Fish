package com.nsl.goldfish.util;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
import java.io.InputStream;

import com.nsl.goldfish.qa.stringOperation.testcase.ReadDataFromExcelUsingDataProviderForStringOperation;

import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class ExcelDataUtility {
		
		public String[][] getExcelData(String fileName,String SheetName) throws IOException

		{
	        String[][] arrayExcelData = null;
	         try {
	        	 InputStream inStream = ExcelDataUtility.class.getResourceAsStream(fileName);
	            Workbook wb = Workbook.getWorkbook(inStream);
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

			} catch (BiffException e) {

				e.printStackTrace();

			}

			return arrayExcelData;

		}


	}



