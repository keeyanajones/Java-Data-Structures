/**
 * Java Associative Array TreeMap Data Structure Example
 * shows TreeMap data structures.
 * 
 * An Associative Array is a collection of (key, value) pairs, such that each 
 * possible key appears at most once in the collection.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;

public class JavaTreeMap {
  public static void main(String[] args) {
    // Creating a TreeMap
    TreeMap<Integer, String> fruitMapping = new TreeMap<>();

    // Adding key-value pairs to a TreeMap
    fruitMapping.put(1, "Apples");
    fruitMapping.put(2, "Oranges");
    fruitMapping.put(3, "Bananas");
    fruitMapping.put(4, "Cherries");    
    fruitMapping.put(5, "Limes");

    System.out.println(fruitMapping);
  }
}
