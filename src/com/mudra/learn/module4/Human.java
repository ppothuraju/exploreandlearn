package com.mudra.learn.module4;

//Write a class to define the Human state and behavior like name, age and height

public class Human {
	
	 // the Human class has
    // three fields
	public String hName = "";
	public int hAge = 0;
	public double hHeight = 0;

	 // the Human class has
    // one constructor
	public Human(String f_h_Name, int h_Age, double h_Height){
		hName = f_h_Name;
		hAge = h_Age;
		hHeight = h_Height;
		
	}
	
	// the Human class has
    // three methods
	
	public void setHumanFullName(String fname, String lname){
		
		hName = fname + " "+ lname;
	}
	
	public String getHumanFullName(){
		
		return hName;
	}
	
	public void setHumanAge(int age){
		
		if(age<0) {
			hAge =0;
		}
		else
			hAge = age;
		
	}
	
	public int getHumanAge(){
		return hAge;
	}
	
	public void setHumanHeight(double height){
		
		if(height<0) {
			
			hHeight =0;
		}
		else
			hHeight = height;
		
		
	}
	
	public double getHumanHeight(){

			return hHeight;
		
		
	} 
	
	public static void main(String[] args) {
		
		Human cHuman = new Human("Pavan Pothuraju",40,5.7);
		
		//through constructor
		System.out.println(cHuman.hName +" "+ cHuman.hAge +" "+cHuman.hHeight);
		
		//through methods
		cHuman.setHumanFullName("Pavan K","Pothu");
		cHuman.setHumanAge(42);
		cHuman.setHumanHeight(5.6);
		
		System.out.println(cHuman.hName + " "+cHuman.hAge+" "+cHuman.hHeight);
		

		
	}

}
	