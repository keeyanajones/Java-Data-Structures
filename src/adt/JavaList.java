/**
 * Java Array List vs Linked List Data Structure Example
 * shows Array List vs Linked List data structures.
 * 
 * A linked list (also just called list) is a linear collection of data elements
 * of any type, called nodes, where each node has itself a value, and points to 
 * the next node in the linked list. The principal advantage of a linked list 
 * over an array, is that values can always be efficiently inserted and removed 
 * without relocating the rest of the list. Certain other operations, such as 
 * random access to a certain element, are however slower on lists than on 
 * arrays.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;    

class JavaList{    
 public static void main(String args[]){    
     
  List al = new ArrayList();//creating arraylist    
   al.add("Tuna");//adding object in arraylist    
   al.add("Salmon");    
   al.add("Shrimp");    
   al.add("Cod");    
    
  List a2 = new LinkedList();//creating linkedlist    
   a2.add("James");//adding object in linkedlist    
   a2.add("Mary");    
   a2.add("Joe");    
   a2.add("Kelly");    
    
  System.out.println("arraylist: " +al);  
  System.out.println("linkedlist: " +a2);  
 }    
} 
