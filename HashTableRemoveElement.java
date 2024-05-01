import java.util.*;

public class HashTableRemoveElement {
	public static void main(String args[])
    {
        // Initialization of a Hashtable
		Hashtable <Integer, String> ht = new Hashtable<Integer, String>();
  
        // Inserting the Elements
   
        ht.put(1, "one");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(4, "Four");
  
        // Initial HashMap
        System.out.println("Initial map : " + ht);
  
          // Remove the map entry with key 4
        ht.remove(4);
  
        // Final Hashtable
        System.out.println("\n"+"Updated map : " + ht);
    }
}
