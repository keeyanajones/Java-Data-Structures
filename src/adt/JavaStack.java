/**
 * Java Stack Data Structure Example
 * shows stack data structures.
 * 
 *  A stack is an abstract data type that serves as a collection of elements, 
 * with two principal operations:
 * 
 *   push, which adds an element to the collection 
 *   pop, which removes the most recently added element that was not yet removed
 * 
 * The order in which elements come off a stack gives rise to its alternative 
 * name, LIFO (last in, first out). Additionally, a peek operation may give 
 * access to the top without modifying the stack.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/

package adt;

import java.util.*;

public class JavaStack {
 static void showpush(Stack st, int a) {
  st.push(new Integer(a));
  System.out.println("push(" + a + ")");
  System.out.println("stack: " + st);
 }

 static void showpop(Stack st) {
  System.out.print("pop -> ");
  Integer a = (Integer) st.pop();
  System.out.println(a);
  System.out.println("stack: " + st);
 }

 public static void main(String args[]) {
  Stack st = new Stack();
  System.out.println("stack: " + st);
   showpush(st, 42);
   showpush(st, 66);
   showpush(st, 99);
   showpop(st);
   showpop(st);
   showpop(st);
   try {
     showpop(st);
   } catch (EmptyStackException e) {
    System.out.println("empty stack");
  }
 }
}
