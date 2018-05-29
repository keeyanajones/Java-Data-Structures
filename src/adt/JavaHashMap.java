/**
 * Java Associative Array HashMap Data Structure Example
 * shows HashMap data structures.
 * 
 * An Associative Array is a collection of (key, value) pairs, such that each 
 * possible key appears at most once in the collection.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package adt;

import java.util.*;

public class JavaHashMap {
  public static void main(String[] args) {
    // Creating a HashMap
    HashMap<Integer, String> fruitMapping = new HashMap<>();

    // Adding key-value pairs to a HashMap
    fruitMapping.put(1, "Apples");
    fruitMapping.put(2, "Oranges");
    fruitMapping.put(3, "Bananas");

    // Add a new key-value pair only if the key does not exist in the 
    // HashMap, or is mapped to `null`
    fruitMapping.putIfAbsent(4, "Cherries");

    System.out.println(fruitMapping);
  }
}

