package com.mudra.learn.module8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class loginTestData {
	
	public static FileInputStream exl;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow rw;
	public static XSSFCell cl;
	
	/*
	public static void main(String[] arg) throws IOException {
		


				
				System.out.println(getLoginDetails(1,1));
				System.out.println(setLoginDetails("abc@test.com",1,1));
				System.out.println(getLoginDetails(1,1));
	} */
	
	public static String getLoginDetails(int row, int col) throws IOException{
		
		 exl = new FileInputStream("src/LoginData.xlsx"); 
		 wb = new XSSFWorkbook(exl);
		 sh = wb.getSheet("Data");
		 rw = sh.getRow(row);
		 cl = rw.getCell(col);
		 return cl.getStringCellValue();
	}
	
	private static String setLoginDetails(String str, int row, int col) throws IOException{
		 exl = new FileInputStream("src/LoginData.xlsx"); 
		 wb = new XSSFWorkbook(exl);
		 sh = wb.getSheet("Data");
		 rw = sh.getRow(row);
		 cl = rw.getCell(col);
		 cl.setCellValue(str);
		 
		// cellValue = cl.getStringCellValue();
				
		return cl.getStringCellValue();
		
	}
}
