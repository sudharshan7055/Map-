package com.map;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.function.UnaryOperator;

public class MapImplementation<K,V> {
	
	LinkedList<MyEntry> list = new LinkedList<>();
	
	
	
	public MapImplementation() {
	}
	
	   //adding key, values to map
	  public void put(K key, V value) {
		  if(key==null)
			  return ; 
		  else 
		  {
	        if(keyExists(key))
	        	return; 
	        else 
	        	list.add(new MyEntry<K, V>(key, value));
	        }
		  }
	 
	public boolean keyExists(K key) {
		for(MyEntry entry:list) {
			if(entry.getKey().equals(key))
				return true;
			}
		return false;
	}

	
	//
	  public void get() {
		  for(MyEntry entry:list) {
	             System.out.println(entry.getKey() + "=" + entry.getValue()); 
	             }
		  }
	
	  //removing the keys from map
	public void remove(K key) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).getKey().equals(key))
				list.remove(index);
			
		}
	}
	
	public Boolean valueExists(V value) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).getValue().equals(value))
				return true;
				
		}
		return false;
	}

     //update method
	public boolean containsKey(int key1) {
		// TODO Auto-generated method stub
		
		if(list.contains(key1))
		{
			list.add(new MyEntry<K, V>(key1,""));
	        
		}
		return false;
			
		
	}
	
	
	 
	        
	

	
	
	
}