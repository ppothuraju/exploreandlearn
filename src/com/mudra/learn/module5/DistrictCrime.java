package com.mudra.learn.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class DistrictCrime {

	private Map<String, List<Integer>> crimeTable;
	
	public DistrictCrime(){
		this.crimeTable = new TreeMap<String, List<Integer>>();
	}
	
	
	public static void main(String[] args) {
		
		DistrictCrime dc = new DistrictCrime();
		dc.crimeTable.put("Little Newark", Arrays.asList(8,77,93));
		dc.crimeTable.put("Springfield Heights", Arrays.asList(8,14,15,31,33,47,77));
		dc.crimeTable.put("Squidport", Arrays.asList(5,8,14,27,31,47,93));
		dc.crimeTable.put("Waterfront", Arrays.asList(2));
		
		
		System.out.println(
				"All Crime Codes : " + dc.crimeList()
		);
		System.out.println(
				"Alone Crime Codes : " + dc.highlyLocalisedCrimeTypes(dc.crimeList())
		);
		
		

	}
	public List<Integer> crimeList(){
		/* 
		 Collection<List<Integer>> crimeCode = crimeTable.values();
		 //Collection<List<Integer>> noDups = new LinkedHashSet<List<Integer>>(crimeTypes);
			//		System.out.println("Unique Crime Codes : " + noDups);

		  System.out.println("All Cirme Codes : " + crimeCode); */
		
		List<Integer> crimeCodes = new LinkedList<>();
		for(List<Integer> ccodes :crimeTable.values()){
			crimeCodes.addAll(ccodes);

		}
			 
		return crimeCodes;

		 // using set to take away duplicates
		// Set<Integer> uniqueCrimeCodes =  new LinkedHashSet<Integer>(crimeCodes);
		 //System.out.println("All Unique Crime Codes : " + uniqueCrimeCodes);
	}
	public List<Integer> highlyLocalisedCrimeTypes(List<Integer> tblValues){
		/*
		List<Integer> crmCodes = new LinkedList<>();
		for(List<Integer> ccodes :crimeTable.values()){
		crmCodes.addAll(ccodes);
		}*/
		List<Integer> distinctCrimes = new ArrayList<Integer>();
		for(Integer dccodes :tblValues){
			if(Collections.frequency(tblValues, dccodes) == 1){
				distinctCrimes.add(dccodes);
			}

		}
		
		return distinctCrimes;
		//System.out.println("Distinct Codes : " +distinctCrimes);


	};
	

}
