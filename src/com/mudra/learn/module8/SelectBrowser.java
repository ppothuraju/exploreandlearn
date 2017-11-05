package com.mudra.learn.module8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class SelectBrowser {
	
	public static WebDriver driver;
	
	public static void main(String[] args){
		
		System.out.println(browserDriver());
		
	}

	public static Properties readPropertyFile(){
		Properties prop = new Properties();
		try{
			prop.load(new FileInputStream("src/module8.properties"));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static String getBrowser(){
		return readPropertyFile().getProperty("TEST_BROWSER");
	}
	public static String browserDriver(){
		
		String browser = readPropertyFile().getProperty("TEST_BROWSER");
	/*
		switch (browser.length()){
			case Firefox:
				driver = getGeckoDriver();
				break;
			case browser:
				driver = getChromeDriver();
			case browser:
				driver = getChromeDriver();
		default:
				driver = getHttpUnit();*/
			
			
		//} 
		return browser;
		
	}

	private static WebDriver getHttpUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	private static WebDriver getChromeDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	private static WebDriver getGeckoDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
