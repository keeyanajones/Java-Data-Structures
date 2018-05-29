/**
 * Java TreeSet Data Structure Example
 * shows TreeSet data structures.
 * 
 * Java TreeSet class implements the Set interface that uses a tree for 
 * storage. It inherits AbstractSet class and implements NavigableSet 
 * interface. The objects of TreeSet class are stored in ascending order. The 
 * important points about Java TreeSet class are:
 *
 *   Contains unique elements only like HashSet.
 *   Access and retrieval times are quiet fast.
 *   Maintains ascending order.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/

package adt;

import java.util.*;  

class JavaTreeSet {  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet tset = new TreeSet();  
   tset.add("Atari");  
   tset.add("PlayStation");  
   tset.add("Xbox");  
   tset.add("Nintendo");  
 
  //Traversing elements  
  Iterator itr = tset.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
