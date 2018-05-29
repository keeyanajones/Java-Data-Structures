/**
 * Java Priority Queue Data Structure Example
 * shows priority queue data structures.
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

public class JavaPriorityQueue {
 public static void main(String[] args) {		
  PriorityQueue queue = new PriorityQueue(); 
   queue.add("one");
   queue.add("two");
   queue.add("three");
   queue.add("four");
   queue.add("five");
   queue.add("six");
   queue.add("seven");
   queue.add("eight");
   
    System.out.println("Queue: " +queue);
    System.out.println("Element: " +queue.element());  
    System.out.println("Peek: " +queue.peek());  
    
    System.out.println();            
    System.out.println("Iterating the queue elements:");  
    
   Iterator itr = queue.iterator();  
   
   while(itr.hasNext()){  
    System.out.println(itr.next());  
   }  
   
   queue.remove(); 
   queue.poll();  
    System.out.println();        
    System.out.println("After removing two elements:");  
    
    Iterator itr2 = queue.iterator();  
    
    while(itr2.hasNext()){  
     System.out.println(itr2.next());  
    }      
    
   queue.remove("three");
   
    System.out.println("Queue: " +queue);
    System.out.println("Queue Size: " + queue.size());
    System.out.println("Queue Contains element 'two' or not? : " 
            + queue.contains("two"));
    System.out.println("Queue Contains element 'five' or not? : " 
            + queue.contains("five"));

   // To empty the queue
   queue.clear();
 }
} 
