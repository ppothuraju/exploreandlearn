package com.mudra.learn.module4;

/*(i) Three private instance variables of type String called firstLine,
secondLine and postCode.
(ii) A constructor with three formal arguments all of type String, which are
used to initialise firstLine, secondLine and postCode respectively.
(iii) A public instance method called getDeliveryInfo() which takes no
arguments and returns a string containing the final three characters of
postCode.
(iv) A public instance method getAddress() which takes a single string
argument. If the argument matches the receiver's post code, the
method returns the concatenation of firstLine, secondLine and
postCode separated by spaces. If there is no match, the method
returns the string "no match"*/


public class PostalAddress {
	
	//three private instance variables
	private String firstLine;
	private String secondLine;
	private String postCode;
	
	public PostalAddress (String fl, String sl, String po)
	{
		firstLine = fl;
		secondLine = sl;
		postCode = po;
		
	}
	
	//method to get final 3 characters of the postcode
	public String getDeliveryInfo()
	{
		return postCode.substring(postCode.length() - 3);
	}
	
	//method to display address
	public String getAddress(String p_code)
	{
		if (postCode == p_code)
		{
			return firstLine +" "+secondLine+" "+postCode;
		}
		else
		{
			return "no match";
		}
	}
	
	public static void main(String[] args) {
		
		PostalAddress paddress =  new PostalAddress("Flat 1","10-12 Woodbury","TN4 9JZ");
		
		System.out.println(paddress.getAddress("TN4 9JZ"));
		System.out.println(paddress.getDeliveryInfo());
		System.out.println(paddress.getAddress("TN49JZ"));
		
	}

}
