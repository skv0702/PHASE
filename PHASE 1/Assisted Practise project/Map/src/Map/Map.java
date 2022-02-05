package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Map {

	public class Entry {

	}

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"A");    
	      hm.put(2,"B");    
	      hm.put(3,"C");   
	       
	      System.out.println("\n HashMap Elements is ");  
	      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"X");  
	      ht.put(5,"Y");  
	      ht.put(6,"Z");  
	      ht.put(7,"Q");  

	      System.out.println("\nHashtable ");  
	      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"p");    
	      map.put(9,"q");    
	      map.put(10,"r");       
	      
	      System.out.println("\nTreeMap ");  
	      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
