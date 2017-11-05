package com.axone.assignments.module4;

public class EvenNumber {

int evenn = 2;
	
	public EvenNumber(int e){
		evenn = e;
	}
	
	public void generate()
	{
		for(int i=0; i<20; i++){
			evenn = evenn + 2;
			System.out.println(evenn);
		}
			
	}
}
