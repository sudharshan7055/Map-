package com.project.map;

public class Main {
	
	public static void main(String[] args)
	   {
	      List L = new List();
	     ListElement e;
	      
	      e = new ListElement("1","a");
	      L.insert(e);
	    
	      e = new ListElement("2","b");
	      L.insert(e);
	      
	      e = new ListElement("3","c");
	      L.insert(e);
	      
	      e = new ListElement("4","d");
	      L.insert(e);
	      	     
	      e = new ListElement("5","e");
	      L.insert(e);
	      System.out.println(L);
	      System.out.println('\n');
		  
		  L.deletion(e);
		  System.out.println("After deleting the first element "+'\n'+ L);
		  
		  L.deletion(e);
		  System.out.println("After deleting the last element "+'\n'+ L);
	      
	      
			/*
			 * L.put("1", "raju"); System.out.println(L);
			 */

	   }
}
