/**
 * Java HashSet Data Structure Example
 * shows HashSet data structures.
 * 
 * Java HashSet class is used to create a collection that uses a hash table 
 * for storage. It inherits the AbstractSet class and implements Set interface.
 * The important points about Java HashSet class are:
 * 
 *   HashSet stores the elements by using a mechanism called hashing.
 *   HashSet contains unique elements only.
 * 
 * NOTE: List can contain duplicate elements whereas Set contains unique elements only.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/

package adt;

import java.util.*;  

class JavaHashSet {  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet hset = new HashSet();  
   hset.add("Minecraft");  
   hset.add("Monster Hunter");  
   hset.add("Far Cry 5");  
   hset.add("Mega Man");  
  
   //Traversing elements  
   Iterator itr = hset.iterator();  
   while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 
