package com.mudra.learn.module5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

public class MyFirstLog {
	
	private FileInputStream rFile = null;
	private static String workingPath = "C:/Users/ppothuraju/workspace/LearnJava/src/com/mudra/learn/module5";
	private static String fileLocation = null;
	private static Logger myLog = Logger.getLogger(MyFirstLog.class.getName());

	public MyFirstLog(String filePath) {
		fileLocation = filePath;
	}
	@SuppressWarnings("hiding")
	private void readFile() {
		
		try {
			 rFile= new FileInputStream(MyFirstLog.fileLocation);
		} catch (FileNotFoundException exFlNotFound) {
			myLog.debug("*** FAILURE - File Not Found Exception *** FilePath:" +MyFirstLog.fileLocation, exFlNotFound);
		} catch (IOException exFlopenerror) {
			myLog.debug("*** File IO Exception *** FilePath:" +MyFirstLog.fileLocation, exFlopenerror);
		} finally {
			//System.out.println(rFile);
			if(rFile!=null){
				try {
					rFile.close();
					myLog.debug("*** SUCCESS - The file at Path:" +MyFirstLog.fileLocation+" has been successfully OPENED ***" );
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}



	public static void main(String[] args) {
		
		MyFirstLog validFile = new MyFirstLog(workingPath+"/readme.txt");
		validFile.readFile();
	    
		MyFirstLog invalidFile = new MyFirstLog(workingPath+"/readme2.txt");
		invalidFile.readFile();


	}

}