/**
 * Java Guava Multimap Data Structure Example
 * shows multimap data structures.
 * 
 * A multimap (sometimes also multihash or multidict) is a generalization of a 
 * map or associative array abstract data type in which more than one value may 
 * be associated with and returned for a given key. Both map and multimap are 
 * particular cases of containers (for example, see C++ Standard Template 
 * Library containers). Often the multimap is implemented as a map with lists 
 * or sets as the map values.
 * 
 * Guava is an open source, Java-based library developed by Google. It 
 * facilitates best coding practices and helps reduce coding errors. It 
 * provides utility methods for collections, caching, primitives support, 
 * concurrency, common annotations, string processing, I/O, and validations. 
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/

package adt;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class JavaGuavaMultiMap {
 public static void main(String args[]) {   
  JavaGuavaMultiMap tester = new JavaGuavaMultiMap();
  Multimap multimap = tester.getMultimap();

  List lowerList = (List)multimap.get("lower");
  System.out.println("Initial lower case list");
  System.out.println(lowerList.toString());

  lowerList.add("f");
  System.out.println("Modified lower case list");
  System.out.println(lowerList.toString());

  List upperList = (List)multimap.get("upper");
  System.out.println("Initial upper case list");
  System.out.println(upperList.toString());

  upperList.remove("D");
  System.out.println("Modified upper case list");
  System.out.println(upperList.toString());

  Map> map = multimap.asMap();
  System.out.println("Multimap as a map");

  for (Map.Entry> entry : map.entrySet()) {
    String key = entry.getKey();
    Collection value =  multimap.get("lower");
    System.out.println(key + ":" + value);
  }

  System.out.println("Keys of Multimap");
  Set keys =  multimap.keySet();

  for(String key:keys) {
    System.out.println(key);
  }

  System.out.println("Values of Multimap");
  Collection values = multimap.values();
  System.out.println(values);
 }

 private Multimap getMultimap() {
   // Map>
   // lower -> a, b, c, d, e
   // upper -> A, B, C, D

  Multimap multimap = ArrayListMultimap.create();
     
  multimap.put("lower", "a");
  multimap.put("lower", "b");
  multimap.put("lower", "c");
  multimap.put("lower", "d");
  multimap.put("lower", "e");

  multimap.put("upper", "A");
  multimap.put("upper", "B");
  multimap.put("upper", "C");
  multimap.put("upper", "D");		

  return multimap;
 }
}
