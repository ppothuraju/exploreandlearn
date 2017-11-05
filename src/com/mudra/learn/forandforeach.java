package com.mudra.learn;

import java.util.ArrayList;
import java.util.List;

public class forandforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int[] numarray = new int[100];
		
		for(int i=0; i<100; i++)
		{
			numarray[i] = i+1;
			System.out.println(numarray[i]);
		} */
	List <Integer> myList = new ArrayList<Integer>();
	List <Integer> myList2 = new ArrayList<Integer>();
	
	for (int i=0; i<1000000; i++) {
		myList.add(i);
	}
	
	long startTime = System.currentTimeMillis();
	
	for (int j=0; j<myList.size(); j++) {
		myList2.add(myList.get(j));	
	}
	
	long endTime = System.currentTimeMillis();
	
	System.out.println("Time taken by for loop = " +(endTime-startTime));
	
	myList2.clear();
	
	startTime = System.currentTimeMillis();
	
	for (int k:myList) {
		myList2.add(myList.get(k));
	}
	endTime = System.currentTimeMillis();
	
	System.out.println("Time taken by for each loop = " +(endTime-startTime));
	
	myList2.clear();
	
	startTime = System.currentTimeMillis();
	myList.forEach(num->myList2.add(myList.get(num)));
	endTime = System.currentTimeMillis();
	System.out.println("Time taken by foreach method loop = " +(endTime-startTime));
	}	
}