package com.mudra.learn.module5;

import java.util.Arrays;
import java.util.List;

public class PhraseCollection {

	String[] phrase = {"The","Cat","sat","on","the","mat"};
	
	public static void main(String[] args) {
		
		String[] phrase = {"The","Cat","sat","on","the","mat"};
		List<String> ph = Arrays.asList(phrase);
		for(String phrases: ph){
			System.out.println(phrases);
		}
		
				

	}

}
