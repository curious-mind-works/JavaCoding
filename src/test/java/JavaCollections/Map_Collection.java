package JavaCollections;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

/*

🔹 Map – Properties (Java Collection)

Stores data in key–value pairs
Keys must be unique
Values can be duplicated
One null key allowed (HashMap), multiple null values allowed
Not a child of Collection interface
Used for fast searching using keys

Common implementations:

HashMap – no order, fast
LinkedHashMap – maintains insertion order
TreeMap – sorted by keys
Hashtable – synchronized, legacy

Typical use case:

When data needs to be stored as key–value pairs (e.g., username → password).

 */

public class Map_Collection {

    public static void main(String[] args)
    {

        Map<Integer, String> map = new HashMap<>();

        //Adding Elements to Map

        //put(key, value)
        map.put(1, "Java");
        map.put(2, "Selenium");
        map.put(3, "REST Assured");

        //Duplicate key (value gets replaced)
         map.put(2, "TestNG"); // Selenium replaced

       // putIfAbsent()
         map.putIfAbsent(4, "API");

       // Iterating a Map

        // 1️ Using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

       // 2️ Using keySet()
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

      // 3️ Using values()
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    /*

    Methods                                             	Description
    V put(K key, V value)	                        Adds a mapping on the map.
    V get(Object key)                           	The value corresponding to the specified key in the map is returned.
    V remove(Object key)                        	The mapping for the specified key is removed.
    int size()	                                    The number of mappings in the map is returned.
    boolean isEmpty()                             	If the map contains no mapping true is returned.
    Set<K> keySet()                               	A set containing the keys in the map is returned.
    Set< Entry<K,V>> entrySet()                 	A set containing the entries in the map is returned.
    Collection <V> values()	                        A collection consisting of the values in the map is returned.



You would have noticed that the Map interface does not extend the Collection interface. Hence, there is no iterator for maps.
Also, map values cannot be accessed without keys. So a map cannot be traversed directly.

To overcome this, Map provides us with methods to retrieve a Collection that we can traverse.
There are three different approaches to this:

Working with the keys:

Set setOfKeys = map.keySet();

Get the Collection of values:

Collection valueCollection = map.values();

Get the set:

Set<Entry> setOfEntries = map.entrySet();

The java.util.Map.Entry interface provides two useful methods:

getKey()
getValue()

     */
}
