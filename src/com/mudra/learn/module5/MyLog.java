package com.mudra.learn.module5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLog {

	
	public static void main(String[] args) { 
	Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh = null; 

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("C:/Users/ppothuraju/workspace/LearnJava/src/com/mudra/learn/module5/MyLogFile.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("My first log");  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

    logger.info("Hi How r u?");  

}

}
