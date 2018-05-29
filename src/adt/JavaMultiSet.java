/**
 * Java Multiset Data Structure Example
 * shows Multiset data structures.
 * 
 * A Multiset (or bag) is a generalization of the concept of a set that, unlike 
 * a set, allows multiple instances of the multiset's elements. For example, 
 * {a, a, b} and {a, b} are different multisets although they are the same set. 
 * However, order does not matter, so {a, a, b} and {a, b, a} are the same 
 * multiset.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class JavaMultiSet {
 public static void main(String args[]) {   
  //create a multiset collection
  Multiset multiset = HashMultiset.create();      
   multiset.add("a");
   multiset.add("b");
   multiset.add("c");
   multiset.add("d");
   multiset.add("a");
   multiset.add("b");
   multiset.add("c");
   multiset.add("b");
   multiset.add("b");
   multiset.add("b");
      
//print the occurrence of an element
   System.out.println("Occurrence of 'b' : "+multiset.count("b"));
      
//print the total size of the multiset
   System.out.println("Total Size : "+multiset.size());
      
//get the distinct elements of the multiset as set
   Set set = multiset.elementSet();
   
//display the elements of the set
   System.out.println("Set [");
      
   set.forEach((s) -> {
       System.out.println(s);
     });

   System.out.println("]");
      
//display all the elements of the multiset using iterator
   Iterator iterator  = multiset.iterator();
   System.out.println("MultiSet [");

   while(iterator.hasNext()) {
    System.out.println(iterator.next());
   }
      
   System.out.println("]");
      
//display the distinct elements of the multiset 
//with their occurrence count
   System.out.println("MultiSet [");

   for (Multiset.Entry entry : multiset.entrySet()) {
    System.out.println("Element: " + entry.getElement() +
                ", Occurrence(s): " + entry.getCount());
   }
     System.out.println("]");

//remove extra occurrences
   multiset.remove("b",2);
      
//print the occurrence of an element
   System.out.println("Occurence of 'b' : " 
                + multiset.count("b"));
 }
}

