/**
 * Java Array List Data Structure Example
 * shows Array List data structures.
 * 
 * ArrayList and LinkedList both implements List interface and maintains 
 * insertion order. Both are non synchronized classes. But there are many 
 * differences between ArrayList and LinkedList classes.
 * 
 * - LinkedList internally uses doubly linked list to store the elements.
 * - Manipulation with LinkedList is faster than ArrayList because it uses 
 *   doubly linked list so no bit shifting is required in memory.
 * - LinkedList class can act as a list and queue both because it implements 
 *   List and Deque interfaces.
 * - LinkedList is better for manipulating data.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;  

public class JavaLinkedList {  
 public static void main(String args[]){    
  LinkedList al = new LinkedList();  
   al.add("Call of Duty");  
   al.add("BattleField");  
   al.add("Counter Strike");  
   al.add("Doom");  
  
  Iterator itr = al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}    
