/**
 * Java Array List Data Structure Example
 * shows Array List data structures.
 * 
 * ArrayList and LinkedList both implements List interface and maintains 
 * insertion order. Both are non synchronized classes. But there are many 
 * differences between ArrayList and LinkedList classes.
 * 
 * - ArrayList internally uses dynamic array to store the elements.
 * - Manipulation with ArrayList is slow because it internally uses array. If 
 *   any element is removed from the array, all the bits are shifted in memory.
 * - ArrayList class can act as a list only because it implements List only.
 * - ArrayList is better for storing and accessing data.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;  

class JavaArrayLists{  
 public static void main(String args[]){  
  ArrayList list = new ArrayList();//Creating arraylist  
   list.add("Nick");//Adding object in arraylist  
   list.add("Eric");  
   list.add("Mike");  
   list.add("Rodney");  
  //Traversing list through Iterator  
  Iterator itr = list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}   

