/**
 * Java Union Data Structure Example
 * shows Union data structures.
 * 
 * A union is a data structure that specifies which of a number of permitted 
 * primitive types may be stored in its instances, e.g. float or long integer. 
 * Contrast with a record, which could be defined to contain a float and an 
 * integer; whereas in a union, there is only one value at a time. Enough space 
 * is allocated to contain the widest member datatype.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
package composite;

import java.util.*;

public class JavaUnion {
     
  public static void main(String args[]) {
    Set A = new HashSet();
    A.addAll(Arrays.asList(2,4,6,8,10));
 
    Set B = new HashSet();
    B.addAll(Arrays.asList(1,2,3,4,5));
 
 // Union: Set of members that belong to set A "or" set B
    Set union = new HashSet();
    union.addAll(A);
    union.addAll(B);
 
    System.out.println("A: " + A);
    System.out.println("B: " + B);
    System.out.println("union: " + union);
  }
}
