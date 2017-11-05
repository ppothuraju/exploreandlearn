package com.mudra.learn.module5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyReader {
	
	private static String pfile = null;
	private static Logger myLog = Logger.getLogger(PropertyReader.class.getName());
		
	public PropertyReader(String filename){
		pfile = filename;
	}
	
	public static Properties openProperyFile(String fname){
		//System.out.println(fname);
		Properties myProps = new Properties();
		try {myProps.load( new FileInputStream(fname) );} 
		catch (FileNotFoundException e) {myLog.debug("*** FAILURE - Property file not found *** FilePath:" +fname, e);}
		catch (IOException e) {	myLog.debug("*** FAILURE - Can't load Property file *** File:" +fname, e);} 
		return myProps;
	}

	public String Parameter1(){
		return openProperyFile(PropertyReader.pfile).getProperty("SEARCH_URL_KEY");}
	
	public String Parameter2(){
		return openProperyFile(PropertyReader.pfile).getProperty("BOOKS_URL_KEY");}	

	public String Parameter3(){
		return openProperyFile(PropertyReader.pfile).getProperty("BUYING_URL_KEY");}
	
	public String Parameter4(){
		return openProperyFile(PropertyReader.pfile).getProperty("NEWS_URL_KEY");}
	
	public String Parameter5(){
		return openProperyFile(PropertyReader.pfile).getProperty("GOV_URL_KEY");}	
	
	
	public static void main(String[] args) {

		PropertyReader keyReader = new PropertyReader("src/module5.properties");
		System.out.println("Parameter1: "+keyReader.Parameter1());
		System.out.println("Parameter2: "+keyReader.Parameter2());
		System.out.println("Parameter3: "+keyReader.Parameter3());
		System.out.println("Parameter4: "+keyReader.Parameter4());
		System.out.println("Parameter5: "+keyReader.Parameter5());
		
	}

}
