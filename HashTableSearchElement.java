	import java.util.*;
	
	public class HashTableSearchElement {
		  public static void main(String args[]){
		//Create hashtable instance
		Hashtable <Integer, String> ht = new Hashtable<Integer, String>();
		  
        // Inserting the Elements
   
        ht.put(1, "one");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(4, "Four");
  
        System.out.println(ht);
        //getting value for the given key from hashtable
        System.out.println("\n"+"Value of key 'second': "+ht.get(2));
        System.out.println("\n"+"Is Hashtable empty? "+ht.isEmpty());
        ht.remove(3);
        System.out.println("\n"+ht);
        System.out.println("\n"+"Size of the Hashtable: "+ht.size());
    }
}