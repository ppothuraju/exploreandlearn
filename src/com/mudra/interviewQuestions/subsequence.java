package com.mudra.interviewQuestions;

/*
I was looking at websites such as https://projecteuler.net/, and I came across this question:

"Given an unordered array of integers of length N > 0, calculate the length of the longest ordered (ascending from left [lower index] to right [higher index]) sub-sequence within the array."
For the live of me I am struggling to find a solution in Java. Can anyone help?
EDIT: 
Some examples:
Example 1
Input: [1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7] Expected Output: 4
Example 2
Input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5] Expected Output: 3
Example 3
Input: [2, 7, 1, 8, 2, 8, 1] Expected Output: 2

A term for what you want to find is a subarray, not a subsequence(according to your examples). You can solve it in a linear time using a simple loop:
 */

public class subsequence {
	
	

	public static void main(String[] args) {
		
		int[] a = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
		//int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
		//int[] a ={2, 7, 1, 8, 2, 8, 1};
		//int[] a ={2, 7, 1, 8, 2, 8};
		//Arrays.sort(a);
		int res = 0;
		int cur = 0;
		for (int i = 0; i < a.length; i++) {
		    if (i > 0 && a[i] <= a[i - 1])
		        cur = 0;
		    cur++;
		    System.out.println(res);
		    res = Math.max(res, cur);
		    
		    System.out.println(res);
		}
		
		System.out.println(res);
	}

}
