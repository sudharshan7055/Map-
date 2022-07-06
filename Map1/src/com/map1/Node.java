package com.map1;

public class Node
{
   int key;       // key is also used to order the nodes
   String value;     // value is associated with the key
   Node   next;      // next is the link for the list

   
   public Node( int k, String v )
   {
      key = k;
      value = v;

      next  = null;
   }
   
   
	 @Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", next=" + next + "]";
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
  
	
	
}
	
