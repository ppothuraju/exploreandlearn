package com.mudra.learn.module8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertyFile {

	//open property file
	public static Properties getPropertyFile(){		
	Properties prop = new Properties();
			    try {
					prop.load( new FileInputStream("src/module8.properties") );
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return prop;
				
		}
	// load the values from property file
	public static String appURL()
	{ return getPropertyFile().getProperty("TEST_APP_URL");	}
	public static String currentBrowser()
	{ return getPropertyFile().getProperty("TEST_BROWSER");	}


}
