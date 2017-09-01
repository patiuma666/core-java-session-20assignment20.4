package Assignment20;
import java.util.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo {
	public static void main (String []args){
	  
		 HashMap <Integer,String >hMap = new HashMap < Integer, String > ();
		 hMap.put(111 ,"Sachin");
		  hMap.put(112, "Doni");
		  hMap.put(113, "Virat");
		  hMap.put(114, "Dhavan");
		
		  //Synchronizing the HashMap Explicitly
		  
		  Map map = Collections.synchronizedMap(hMap);
		  
		  synchronized(hMap) {
			  
		   Set<Integer> kys = hMap.keySet();
		   
		   //Displaying the Keys 
		   System.out.println("Displaying the keys :");
		   
		   for (Integer key: kys) {
			   
		    System.out.println(key);
		   }
		   Set st = hMap.entrySet();
		   
		   //Creating an Iterator Object
		   Iterator itr = st.iterator();
		   
		   //Displaying the values
		   System.out.println("Displaying the values :");
		   
		   while (itr.hasNext()) {
			   
		    Map.Entry mp = (Map.Entry) itr.next();
		    
		    System.out.println(mp.getValue());
		   }
		  }
		}
		}

