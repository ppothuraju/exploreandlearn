package com.mudra.learn.module8;

public enum Browsers {
	FIREFOX,
	CHROME,
	IE, 
	SAFARI,
	HTMLUNIT;

	public static Browsers browserName(String browser) throws IllegalArgumentException{
        for(Browsers b: values()){
    		if(b.toString().equalsIgnoreCase(browser)){
    			return b;
    		}
        }
        throw browserNotFound(browser);
    }

    private static IllegalArgumentException browserNotFound(String outcome) {
        return new IllegalArgumentException((outcome +" browser not found"));
    }
}