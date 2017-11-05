package com.mudra.learn.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class UFOSurvey {

	private Map<Integer, List<String>> alienSightings;
	
	public UFOSurvey(){
		this.alienSightings = new TreeMap <Integer,List<String>>();
	}
	public static void main(String[] args) {
		
		
		UFOSurvey ufo = new UFOSurvey();
		ufo.alienSightings.put(52, Arrays.asList("Azure","Lime","Purple"));
		ufo.alienSightings.put(48, Arrays.asList("Coral"));
		ufo.alienSightings.put(49,Arrays.asList("HoneyDew","Ash","Red"));
		ufo.alienSightings.put(51,Arrays.asList("Purple","Navy","Teal","Coral"));
		ufo.alienSightings.put(50,Arrays.asList("Red","Indigo"));
		ufo.addSighting(52, "White");
		ufo.addSighting(52, "Lime");
		ufo.addSighting(52, "Blue");
		ufo.addSighting(64, "Lime");
		ufo.addSighting(64, "Red");
		ufo.findAreasForColour("Yellow");
		ufo.findAreasForColour("Lime");
		ufo.findAreasForColour("Red");
		//print the map
		for (Integer key : ufo.alienSightings.keySet()) {
		    System.out.println(key + " " + ufo.alienSightings.get(key));
		}
		/*
		  for(Entry<Integer, List<String>> entry : ufo.alienSightings.entrySet())
		    {   //print keys and values
		         System.out.println(entry.getKey() + " : " +entry.getValue());
		    }
	
		
		//print the array of areas found
		for(Integer area : ufo.findAreasForColour("Lime")){
			System.out.println(area);
		}	*/
	}

	public void addSighting(Integer code, String colour){
		
		if(alienSightings.containsKey(code)){
			//System.out.println(code);
			
			List<String> colourList = alienSightings.get(code);
			List<String> colourValues = new ArrayList<String>();
			for(String s: colourList){
				//System.out.println(s);
				if(s.contentEquals(colour)){
					System.out.println("Colour "+ s +" already exist in Area "+ code);
					
				}
				else{
					//alienSightings.put(code, Arrays.asList(colour));
					
					colourValues.add(s);

			}

			}
			colourValues.add(colour);
			alienSightings.put(code, colourValues);
		}
		
		if(!alienSightings.containsKey(code)){
			alienSightings.put(code, Arrays.asList(colour));

		}
		
	}
	public List<Integer> findAreasForColour(String colourcode)
	{
		List<Integer> colourKeys = new ArrayList<Integer>();
		for (Integer key : alienSightings.keySet()) {
			List<String> colourList = alienSightings.get(key);
			
			for(String s: colourList){
			//	System.out.println(s);
				if(s.contentEquals(colourcode)){
					colourKeys.add(key);
					System.out.println("The colour "+ colourcode.toUpperCase() +" is found in area "+ key);
				}
			}
			
		}
		if(colourKeys.isEmpty()){
			System.out.println("The colour "+ colourcode.toUpperCase() +" is not found any areas"); 
			}
		return colourKeys;
	}
}
