/**
 * Java Arrays Data Structure Example
 * shows Array data structures.
 * 
 * An array data structure, or simply an array, is a data structure consisting 
 * of a collection of elements (values or variables), each identified by at 
 * least one array index or key. An array is stored so that the position of 
 * each element can be computed from its index tuple by a mathematical 
 * formula. The simplest type of data structure is a linear array, also 
 * called one-dimensional array.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
package composite;

public class JavaArray {
 
  public static void main(String args[]){      
    // declaration and instantiation
    int a[] = new int[5];   
      a[0] = 10; // initialization  
      a[1] = 20;  
      a[2] = 70;  
      a[3] = 40;  
      a[4] = 50;  

    // printing array  
    // length is the property of array  
    for(int i = 0; i < a.length; i++) 
      System.out.println("Value of Array variable " + i + " is : " + a[i]);  
  }
}

