// Authors: @Marthely237 & @luckyjohn-rwanda
// Java program to copy all of the mappings from the specified map to another map.

import java.util.*;  
public class Mapping {  
	
   public static void main(String args[]) {
	   
  // creating the hash maps
	   
  HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map3 = new HashMap <Integer,String> ();
  
  // populating the hash maps
  
  hash_map1.put(1, "Cameroon");
  hash_map1.put(2, "Ghana");
  hash_map1.put(3, "Nigeria");
  
  System.out.println("\nValues in the first map: " + hash_map1);
  
  hash_map2.put(4, "Rwanda");
  hash_map2.put(5, "Kenya");
  hash_map2.put(6, "Uganda");
  
  System.out.println("\nValues in the second map: " + hash_map2);
  
  hash_map3.put(7, "Paul Biya");
  hash_map3.put(8, "Paul Kagame");
  hash_map3.put(9, "Paul Walker");
  
  System.out.println("\nValues in the third map: " + hash_map3);

  // Adding values from the first map in the second map
  //Adding values from the second map in the third map
  
  hash_map3.putAll(hash_map2);
  hash_map2.putAll(hash_map1);
  
  
  
  System.out.println("\nNow the values in the second map are: " + hash_map2);
  System.out.println("\nNow the values in the third map are: " + hash_map3);
 }
}