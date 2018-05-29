/**
 * Java Multimap Data Structure Example
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

import java.util.*;

class JavaMultiMap<K, V> {
  private final Map<K, Collection<V>> map = new HashMap<>();
  /**
   * Add the specified value with the specified key in this multimap.
   **/
  public void put(K key, V value) {
    if (map.get(key) == null)
      map.put(key, new ArrayList<>());

    map.get(key).add(value);
  }

  /**
   * Associate the specified key with the given value if not
   * already associated with a value
   **/
  public void putIfAbsent(K key, V value) {
    if (map.get(key) == null)
      map.put(key, new ArrayList<>());

    // if value is absent, insert it
    if (!map.get(key).contains(value)) {
      map.get(key).add(value);
    }
  }

  /**
   * Returns the Collection of values to which the specified key is mapped,
   * or null if this multimap contains no mapping for the key.
   **/
  public Collection<V> get(Object key) {
    return map.get(key);
  }

  /**
   * Returns a Set view of the keys contained in this multimap.
  **/
  public Set<K> keySet() {
    return map.keySet();
  }

  /**
   * Returns a Set view of the mappings contained in this multimap.
   **/
  public Set<Map.Entry<K, Collection<V>>> entrySet() {
    return map.entrySet();
  }

  /**
   * Returns a Collection view of Collection of the values present in this 
   * multimap.
   **/
  public Collection<Collection<V>> values() {
    return map.values();
  }

  /**
   * Returns true if this multimap contains a mapping for the specified key.
   **/
  public boolean containsKey(Object key) {
    return map.containsKey(key);
  }

  /**
   * Removes the mapping for the specified key from this multimap if present.
   * and returns the Collection of previous values associated with key, or
   * null if there was no mapping for key.
   **/
  public Collection<V> remove(Object key) {
    return map.remove(key);
  }

  /**
   * Returns the number of key-value mappings in this map.
   **/
  public int size() {
    int size = 0;
    size = map.values().stream().map((value) -> value.size()).reduce(size, Integer::sum);
    return size;
  }

  /**
   * Returns true if this map contains no key-value mappings.
   **/
  public boolean isEmpty() {
    return map.isEmpty();
  }

  /**
   * Removes all of the mappings from this map.
   **/
  public void clear() {
    map.clear();
  }

  /**
   * Removes the entry for the specified key only if it is currently
   * mapped to the specified value and return true if removed
   **/
  public boolean remove(K key, V value) {
    if (map.get(key) != null) // key exists
    return map.get(key).remove(value);
  return false;
  }

  /**
   * Replaces the entry for the specified key only if currently
   * mapped to the specified value and return true if replaced
   **/
  public boolean replace(K key, V oldValue, V newValue) {
    if (map.get(key) != null) {
      if (map.get(key).remove(oldValue))
      return map.get(key).add(newValue);
    }
    return false;
  }
}

class MapUtils {
  // Multimap implementation in Java
  public static void main(String[] args) {
    // create a Multimap from past US presidents list
    JavaMultiMap<String, String> multimap = new JavaMultiMap();

    multimap.put("Zachary", "Taylor");
    multimap.put("John", "Adams");
    multimap.put("John", "Tyler");
    multimap.put("John", "Kennedy");
    multimap.put("George", "Washington");
    multimap.put("George", "Bush");
    multimap.put("Grover", "Cleveland");

    System.out.println("--------Printing Multimap using keySet ----------\n");
    
    multimap.keySet().forEach((lastName) -> {
        System.out.println(lastName + ": " + multimap.get(lastName));
      });
  }
}
