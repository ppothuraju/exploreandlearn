package com.mudra.learn.module8;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDrivers {
	
	public static WebDriver getBrowser() {
		Browsers browser;
		WebDriver driver;
	
		if(LoadPropertyFile.currentBrowser().isEmpty()){
			throw new RuntimeException ("Browser details not provided in the properties file.");
		}
		else{
			browser = Browsers.browserName(LoadPropertyFile.currentBrowser());
		}
		switch(browser){
			case CHROME:
				driver = createChromeDriver();
				break;
			case IE:
				driver = createIEDriver();
				break;
			case FIREFOX:
				driver = createFirefoxDriver();
				break;
			case SAFARI:
				driver = createSafariDriver();
				break;
			case HTMLUNIT:
				driver = createHttpUnitDriver();
			default:
				throw new RuntimeException (LoadPropertyFile.currentBrowser()+"-"+"Browser not supported");
		}
	//	driver.get(LoadPropertyFile.appURL());
		//addAllBrowserSetup(driver);
		return driver;
	}


	private static WebDriver createChromeDriver() {
		return new ChromeDriver();
	}
	
	private static WebDriver createIEDriver() {
		return new InternetExplorerDriver();
	}
	
	private static WebDriver createFirefoxDriver() {
		return new FirefoxDriver();
    }

	private static WebDriver createSafariDriver() {
			return new SafariDriver();
	}
	
	private static WebDriver createHttpUnitDriver() {
		return new HtmlUnitDriver();
	}
	
	@SuppressWarnings("unused")
	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(dim);
	}

}
