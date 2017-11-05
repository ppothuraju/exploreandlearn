package com.mudra.learn.module8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadandPrintTourType {

	
	public static void main(String[] arg){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net");
		System.out.println(driver.getTitle());
		
		WebElement toursOnBody = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-title='TOURS']")));
		toursOnBody.click();
		
		Select tours = new Select(driver.findElement(By.id("tourtype")));
		List<WebElement> options = tours.getOptions();
		System.out.println(options.size());
	
		
	}
	
	
}
