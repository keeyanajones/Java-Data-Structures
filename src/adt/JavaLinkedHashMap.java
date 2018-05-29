/**
 * Java Associative Array LinkedHashMap Data Structure Example
 * shows LinkedHashMap data structures.
 * 
 * An Associative Array is a collection of (key, value) pairs, such that each 
 * possible key appears at most once in the collection.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;

public class JavaLinkedHashMap {
  public static void main(String[] args) {
    // Creating a LinkedHashMap
    LinkedHashMap<Integer, String> fruitMapping = new LinkedHashMap<>();

    // Adding key-value pairs to a LinkedHashMap
    fruitMapping.put(1, "Apples");
    fruitMapping.put(2, "Oranges");
    fruitMapping.put(3, "Bananas");
    fruitMapping.put(4, "Cherries");
    fruitMapping.put(5, "Limes");    
    fruitMapping.put(6, "Lemons");    

    System.out.println(fruitMapping);
  }
}
