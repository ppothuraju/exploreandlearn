package com.mudra.learn.module8;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class LoginTest {

	private String usr;
	private String pwd;
	private static zohoLogin zohologin;
	private static WebDriver driver;
	int loop = 0;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = BrowserDrivers.getBrowser();
		zohologin = new zohoLogin(driver);
		driver.get("http://www.zoho.eu");
		zohologin.getToLoginPage();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}

	@Before
	public void initialize() throws Exception {

		
	}


	public LoginTest(String usr,String pwd){
		this.usr = usr;
		this.pwd = pwd;
		//this.expectedResult = expectedResult;

	}
	@Parameterized.Parameters
	public static Collection<Object[]> valuesFromExcel() throws IOException{
		return Arrays.asList(new Object[][]{
			{loginTestData.getLoginDetails(0,0),loginTestData.getLoginDetails(0,1)},
			{loginTestData.getLoginDetails(1,0),loginTestData.getLoginDetails(1,1)},
			{loginTestData.getLoginDetails(2,0),loginTestData.getLoginDetails(2,1)}
			
		});
		
	}
	@After
	public void tearDown() throws Exception {

		//driver.quit();
	}

	@Test
	public void testLoginTest() throws IOException {
		System.out.println("Parameterized values are : " + usr +" and " + pwd);		
		assertEquals (false,
				zohologin.loginValues(usr, pwd)	);
		

		
		
	
	}

}
