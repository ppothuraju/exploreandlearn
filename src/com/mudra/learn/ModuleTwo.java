package com.mudra.learn;

import java.util.Arrays;

public class ModuleTwo {

		public static void main(String[] args)	{
			
			int numArray[] = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,31,1,1};

			Arrays.sort(numArray);
			int num = numArray[0];
			int count = -1; 
			for (int i=0; i<numArray.length; i++) 
			{

			    	if(numArray[i] == num)
			    	{
			    		count++;
			    		continue;
			    	}
				System.out.println(num + " - Repeated " + count + " times.");
				num = numArray[i];
			    count = 1;

			}
			System.out.println(num + " - Repeated " + count + " times.");


		}
		}