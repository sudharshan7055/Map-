package com.map1;

import java.util.List;
import java.util.Map;

public class Main {
	
public static void main(String[] args) throws Exception

{

	List<Map<String, String>> map = new ListMap();

	
	//MapInterface map = new ListMap();
	String v;
	
	
	map.put(1, "male person");
    map.put(2, "female person");
   
    System.out.println(map);
    
    System.out.println();
    
    v = map.get(1);
    System.out.println("get(1): v = " + v);
    System.out.println();
		
		
	}


}
