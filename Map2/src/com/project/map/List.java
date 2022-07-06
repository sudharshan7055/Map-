package com.project.map;

public class List {

	public ListElement head;
	public int N;

	public List() {
		// TODO Auto-generated constructor stub
		head = null; // start with empty list
		N = 0;
	}

	public int size() {
		return (N);
	}

	

	// insert(v): insert at head
	// -------------------------------

	public void insert(ListElement p) {

		if (N == 0) {
			p.next = null;
			p.prev = null;

			head = p;
		} else {
			p.next = head;
			p.prev = null;
			head.prev = p;
			head = p;
		}

		N++;
	}

	// to string method
	  public String toString() { 
		  
		  String r = "";
		  ListElement p;
	  
	      p = head; // Very important: start at first element
	  
	     //  r = r + "{";
	       while (p != null) {
	    	   r = r + p + "  ";
	    	   p = p.next; 
	    	  } 
	       return (r);
	  }
	 
	
	  
	  
		/*
		 * public String put(String k, String v) {
		 * 
		 * ListElement p; String old;
		 * 
		 * for ( p = head; p != null; p = p.next ) { if ( p.key.equals( k ) ) { old =
		 * p.value; p.value = v; // Replace old value
		 * 
		 * return( old ); } }
		 * 
		 * //------------------------------- Not found, insert new entry //
		 * ------------------------------- p = new ListElement(k, v);
		 * 
		 * insert(p);
		 * 
		 * return(null); }
		 */
	  
	  
	  public void deletion(ListElement p) {
		  
		  ListElement prevelement , nextelement;
		  
		  if(N==0)            //No elements in the list , Nothing to delete 
		  {
			  return ;
		  }
		  else if(p.prev==null)    // we deleting the first element in the list
		  {
			  
			  nextelement = p.next;
			  nextelement.prev = null; 
			  head = nextelement;      //now the second element is the first element
			  
			  System.out.println("deleting the first element  key: "+  p.key);
		  }
		  else if(p.next==null)     // we are deleting the last element 
		  {
			  prevelement = p.prev;
			  prevelement.next=null;
			  
			  System.out.println("deleting the last element  key: " + p.key); 
			  
		  }
		  
		 
		  
	  }
	  

}
