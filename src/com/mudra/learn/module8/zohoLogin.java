package com.mudra.learn.module8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class zohoLogin {

		public WebDriver Driver;
		
		public zohoLogin(WebDriver driver){
			this.Driver = driver;
		}
		
		public void getToLoginPage(){
			System.out.println("The home Page title is: " + Driver.getTitle());
			Driver.findElement(By.linkText("Login")).click();
			
			(new WebDriverWait(Driver, 10))
					  .until(ExpectedConditions.titleContains("Zoho Accounts"));		

			
			System.out.println("The current url is: " + Driver.getCurrentUrl());
			
			System.out.println("The current page is: " + Driver.getTitle());
			
			
			//System.out.println(driver.getPageSource());
			
		}
		public Boolean loginValues(String user, String pword) {
		
		WebElement txtEmail = (new WebDriverWait(Driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lid']")));
		txtEmail.sendKeys(user);
		
		WebElement txtPwd = Driver.findElement(By.id("pwd"));
		txtPwd.sendKeys(pword);
		
		Driver.findElement(By.id("signin_submit")).click();
		/*
		File src= ((TakesScreenshot)Driver). getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		txtEmail.clear();
		txtPwd.clear();
		
		/*WebElement failMessage = (new WebDriverWait(Driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//[id='msgpanel']")));*/
		/*
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		

		String return_value = (String) js.executeScript("return document.getElementById('msgpanel').innerHTML");
		//String return_value2 = (String) js.executeScript("return document.getElementByClassName('msg').innerHTML");
		
		
		if (return_value.isEmpty()){
			System.out.println(return_value);
			
			return false;
		}
		
		//System.out.println(return_value);*/

		return true;
		}
		
		
}

