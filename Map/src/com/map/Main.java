package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		
		MapImplementation<Integer ,String> mymap = new MapImplementation<>();
		
		
		mymap.put(1, "car");
		mymap.put(2, "bus");
		mymap.put(3, "lorry");
		mymap.put(4, "train");
		
	//	mymap.show();
		
	//	mymap.remove(3);
	//	mymap.show();
		
		//mymap.get(4);
		//mymap.show();
		
		
		mymap.get();
		
		
	//	mymap.update(3,"sudh");
		
		System.out.println("Enter your key");
		Scanner s = new Scanner(System.in);
		
		int key1 = s.nextInt();
		
		if(mymap.containsKey(key1)) {
			mymap.put(key1, "sudh");
		}
				
		mymap.get();
		
	}

}
