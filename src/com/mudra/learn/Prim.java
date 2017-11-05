package com.mudra.learn;

public class Prim	{	
	public static void main(String[]	args)	{	
		int num1 =	12;	
		float num2 =	17.8f;	
		boolean eJavaResult =	true;	
		//boolean returnVal =	num1 >=	12	&&	num2 <	4.567	
				//	||	eJavaResult ==	true;
			
		//boolean returnVal = (num1 >= 12 && num2 < 4.567) || eJavaResult ==true;
		
		boolean returnVal = num1 >= 12 && (num2 < 4.567 || eJavaResult == false);
		System.out.println(returnVal);

	}
}	
