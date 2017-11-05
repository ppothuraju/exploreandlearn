package com.mudra.learn.module5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HeadOffice {
	
	private TreeMap<String,List<Integer>> branchTable;
	
	public HeadOffice(){
		this.branchTable = new TreeMap<String, List<Integer>>();
	}

	public static void main(String[] args) {
		
		HeadOffice ho = new HeadOffice();
		
		ho.branchTable.put("Chelsea", Arrays.asList(23,8,77,13,23,7));
		ho.branchTable.put("Maida Vale", Arrays.asList(76,14,11,7,11,24,8,9));
		ho.branchTable.put("Belgravia", Arrays.asList(17,2,6,9,14,8,7));
		ho.branchTable.put("Knightsbridge", Arrays.asList(31,7,9,16,32,31));
		
		System.out.println("Branch Table: "+ho.branchTable);
		System.out.println("Unique Product Codes: "+ho.getUniqueProductCodes());
		System.out.println("Popular Product Codes:"+ho.getPopularProducts());
		System.out.println("Popular Product Codes:"+ho.getPopularProducts2());
	}
	
	private Set<Integer>getUniqueProductCodes(){
		
		Set<Integer> productCodes = new TreeSet<>();
		
		for(List<Integer> pcodes :branchTable.values()){
			
			productCodes.addAll(pcodes);

		}
		return productCodes;
	}
	
	public Set<Integer> getPopularProducts(){
		
		Set<Integer> popularCodes = new TreeSet<>();

		//Integer holdValue = getUniqueProductCodes().iterator().next();
		//System.out.println(holdValue);
		
		for(Integer i:getUniqueProductCodes()){
			
			Integer count = 0;
			Integer holdValue = 0;
	        
			for(Entry<String, List<Integer>> m : branchTable.entrySet()){

				if(m.getValue().contains(i)){
					holdValue =i;
				//	System.out.println("inside value = "+i + " => "+m.getKey()+"=> "+m.getValue());
				//	System.out.println("Count: "+count);
						
					if(i==holdValue){
						count++;
						//System.out.println("inside i=:" +i);
						//	System.out.println("Count:" +count);
					}
					if(count>=3){
						popularCodes.add(i); //count=-1;
					}
				 }
				
			 }

		  }
	return popularCodes;
	}
	
	//another method to get popular products without using earlier unique set
	public Set<Integer> getPopularProducts2(){
	
	Set<Integer> popularCodes = new TreeSet<>();
		
	List<Integer> productCodes = new LinkedList<>();
	for(List<Integer> procodes :branchTable.values()){
		productCodes.addAll(procodes);
	}
	
	for(Integer popCodes :productCodes){
		if(Collections.frequency(productCodes, popCodes) >= 3){
			popularCodes.add(popCodes);
		}

	}
	return popularCodes;
	
	}

}
