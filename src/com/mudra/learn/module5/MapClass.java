package com.mudra.learn.module5;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map<String, Integer>ageMap = new HashMap<String, Integer>();
		ageMap.put("Anna", 33);
		ageMap.put("Ben", 45);
		ageMap.put("Ben", 33);
		ageMap.put("Chas", 33);
		ageMap.keySet().remove("Anna");
		ageMap.values().remove(33);
		System.out.println(ageMap.size());

	}

}
