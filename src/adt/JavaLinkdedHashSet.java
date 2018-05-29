/**
 * Java LinkedHashSet Data Structure Example
 * shows LinkedHashSet data structures.
 * 
 * Java LinkedHashSet class is a Hash table and Linked list implementation of
 * the set interface. It inherits HashSet class and implements Set interface. 
 * The important points about Java LinkedHashSet class are:
 * 
 *   Contains unique elements only like HashSet.
 *   Provides all optional set operations, and permits null elements.
 *   Maintains insertion order.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;  

class JavaLinkdedHashSet {  
 public static void main(String args[]){  
  //Creating and adding elements   
  LinkedHashSet  lhset = new LinkedHashSet ();  
   lhset.add("Cards");  
   lhset.add("Chess");  
   lhset.add("Checkers");  
   lhset.add("Uno");  

  //Traversing elements     
  Iterator itr = lhset.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  