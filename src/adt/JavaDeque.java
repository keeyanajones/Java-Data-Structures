/**
 * Java Deque Data Structure Example
 * shows deque data structures.
 * 
 * A Queue (Double-ended queue or Priority queue) is a particular kind of 
 * abstract data type or collection in which the entities in the collection 
 * are kept in order and the principle (or only) operations on the collection 
 * are the addition of entities to the rear terminal position, known as 
 * enqueue, and removal of entities from the front terminal position, known as 
 * dequeue. This makes the queue a First-In-First-Out (FIFO) data structure.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;

public class JavaDeque {
 public static void main(String[] args) {		
  Deque deque = new ArrayDeque();  
   deque.offer("one");
   deque.offer("two");
   deque.add("three");
   deque.add("four");
   deque.add("five");
   deque.offerFirst("six");
   deque.add("seven");
   deque.add("eight");
  
  System.out.println("After offerFirst Traversal...");  
   for(Object s:deque){  
     System.out.println(s);  
   }  

//Print the first element of the ArrayDeque.
   System.out.println("First element: " 
                + deque.getFirst());

//Print the last element of the ArrayDeque.
   System.out.println("Last element: " 
                + deque.getLast());

   deque.poll();  
//Remove the first element same as poll()  
   deque.pollFirst();
   deque.pollLast();  
   
  System.out.println();       
  System.out.println("After pollLast() Traversal...");  
   for(Object s:deque){  
    System.out.println(s);  
   }  
 }
}          


