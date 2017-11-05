package com.mudra.learn.module4;

/*
 * 6.	The	following	Java	code	fragment	adds	up	the	first	10	odd	integers	and
assigns	the	result	to	a	variable	called	total.
int	total	=	0;
int	number	=	1;
while	(number	<	20)
{
total	=	total	+	number;
number	=	number	+	2;
}
Rewrite	the	above	code	so	that	it	uses	a	for	loop
 */

public class First10OddTotal {
	
	public static void main(String arg[]){
	
		int total = 0;
		
		for(int i=1; i<20;i+=2){
			
			total = total+i;
		}
		System.out.println("The tota of first 10 odd number is:" + total);
	}

}
