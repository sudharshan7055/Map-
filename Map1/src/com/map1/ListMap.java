package com.map1;

import java.util.List;
import java.util.Map;

public class  ListMap implements MapInterface {
	
	public Node head;   // head points to first Node of the list
    // **** Access SHOULD be set to private ****

     public int  NEntries;  // Number of entries (nodes)


    @Override
	public void put(int k, String v) {
		// TODO Auto-generated method stub
		
		Node e;

	       e = LookupNode( k );

	       if ( e != null )
	       {  /* ===============================
	             e contains the search key k
		     =============================== */
	          e.value = v;              // Update the value
	          return;                   // DONE !!!
	       }

	       /* ==============================================
	          Key k not found ==> insert (k,v)
	          ============================================== */

	       e = new Node( k, v );   // Make node containg (k,v)

	       
	       NEntries++;             // Keep track of the number of nodes !!!
	    }
	
	public Node LookupNode(int k)
    {
       Node ptr;

       ptr = head;               // Start at the first node        

       while ( ptr != null )
       {
          if ( k==(ptr.key) )
          {
             return(ptr);        // Found node: return
          }

          ptr = ptr.next;   // Try next node
       }

       return null;              // Not found....
    }

	@Override
	public String get(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(int k) {
		// TODO Auto-generated method stub
		return null;
	}


	


}
		
	
	