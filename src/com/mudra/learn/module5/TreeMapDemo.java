package com.mudra.learn.module5;

import java.util.*;

public class TreeMapDemo {
   public static void main(String[] args) {
   // creating maps 
   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
  // SortedMap<Integer, String> treemapincl = new TreeMap<Integer, String>();
            
   // populating tree map
   treemap.put(2, "two");
   treemap.put(1, "one");
   treemap.put(3, "three");
   treemap.put(6, "six");
   treemap.put(5, "five");      
      
   System.out.println("Getting collection from the map");
   Collection<String> coll=treemap.values();
   System.out.println("Value of the collection: "+coll);      
   }    
}