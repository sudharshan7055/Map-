package com.map;

public class MyEntry<K, V> {
	
	
	private K key;
	private V value;
	
	private K key1;
	private V string;
	
	
	public MyEntry() {	
	}
	
	public MyEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	

	public MyEntry(int key1, String string1) {
		// TODO Auto-generated constructor stub
		super();
		this.key = key;
		this.string = (V) string1;
		
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	
	

}
