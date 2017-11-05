package com.mudra.learn.module8;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mudra.learn.module8.LoadPropertyFile;
import com.mudra.learn.module8.BrowserDrivers;

public class TestReadandPrintTourType {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {

		this.driver = BrowserDrivers.getBrowser();
		driver.get(LoadPropertyFile.appURL());
		System.out.println("The test browser is:" + driver);
	}
		

	@Test
	public void test() {
		
		System.out.println("The page title is: "+ driver.getTitle());
		
		WebElement toursOnBody = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-title='TOURS']")));
		toursOnBody.click();
		
		Select tourTypes = new Select(driver.findElement(By.id("tourtype")));
		List<WebElement> allOptions = tourTypes.getOptions();
		System.out.println("\n There are "+ allOptions.size() +" tour types");
		
		for (WebElement values: allOptions) {
			System.out.println(values.getText());
		}
	}
	@After
	public void tearDown() throws Exception {
		this.driver.quit();
	}


}
