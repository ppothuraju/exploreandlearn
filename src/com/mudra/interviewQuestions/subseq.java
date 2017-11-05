package com.mudra.interviewQuestions;

import java.util.Arrays;

public class subseq {

	public static void main(String[] args) {
		//int[] arr = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
		//int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
		//int[] arr = {2, 7, 1, 8, 2, 8, 1};
		int[] arr = {2, 7, 1, 8, 2, 8};
		Arrays.sort(arr);
		System.out.println("The sorted array is "+ Arrays.toString(arr));
		int arrElement = arr[0];
		int subSeqCount = 0;
	    int noOfSeq = 0;


	    for (int i = 0; i < arr.length; i++) 
	    {
	    	if(arr[i]==arrElement)
	    	{
	    		subSeqCount++;
	    	}
	    	else
	    	{
	    		if (subSeqCount > 1)
	    		{
	    			noOfSeq++;
	    			subSeqCount = 1;
	    		}
	    		arrElement = arr[i];
	    	}
	    }
	    System.out.println("The number of sub sequences in the given array are: "+noOfSeq);

	}

}
