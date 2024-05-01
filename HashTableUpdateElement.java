
import java.util.*;

public class HashTableUpdateElement {
	   public static void main(String args[]){
			  
	        Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
	        ht.put(1, "One");
	        ht.put(2, "Two");
	        ht.put(3, "Three");
	          
	          // print initial map to the console
	        System.out.println("Initial Map " + ht);
	          
	          // Update the value at key 2
	        ht.put(2, "Dho");
	          
	          // print the updated map
	        System.out.println("\n"+"Updated Map " + ht);
	    }
	}

