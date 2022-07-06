package com.project.map;

public class ListElement {
	
	public  String key;
    public  String value;
    
    public  ListElement prev;        // Double linked list for easy deletion      
    public  ListElement next;
  
	
    
    public ListElement(String k, String v) {
		super();
		this.key = k;
		this.value = v;
	}


	@Override
	public String toString() {
		return "ListElement [key=" + key + ", value=" + value + "]";
	}
  
    
    
  

}
