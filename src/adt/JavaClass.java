/**
 * Java Array List Data Structure Example
 * shows Array List data structures.
 * 
 * A class is a data structure that contains data fields, like a record, as 
 * well as various methods which operate on the contents of the record. In 
 * the context of object-oriented programming, records are known as plain old 
 * data structures to distinguish them from classes.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;
               
public class JavaClass {
 // Create an array
 private final static int SIZE = 15;
 private int[] arrayOfInts = new int[SIZE];
     
 public JavaClass() {
   // fill the array with ascending integer values
   for (int i = 0; i < SIZE; i++) {
       arrayOfInts[i] = i;
  }
 }
     
 public void printEven() {
  // Print out values of even indices of the array
  ClassesIterator iterator = this.new EvenIterator();
  while (iterator.hasNext()) {
   System.out.print(iterator.next() + " ");
  }
  System.out.println();
 }
     
 interface ClassesIterator extends java.util.Iterator { }
// Inner class implements the ClassesIterator interface,
// which extends the Iterator interface
 private class EvenIterator implements ClassesIterator {
  // Start stepping through the array from the beginning
  private int nextIndex = 0;
         
  public boolean hasNext() {             
  // Check if the current element is the last in the array
   return (nextIndex <= SIZE - 1);
  }        
        
 public Integer next() {
  // Record a value of an even index of the array
  Integer retValue = 
          Integer.valueOf(arrayOfInts[nextIndex]);
  // Get the next even element
  nextIndex += 2;
   return retValue;
  }
 }
     
 public static void main(String s[]) {
 // Fill the array with integer values and print out only
 // values of even indices
  JavaClass cl = new JavaClass();
   cl.printEven();
 }
}

