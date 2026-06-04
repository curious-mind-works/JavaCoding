package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

🔹 List – Properties (Java Collection)

Ordered collection – maintains insertion order
Allows duplicate elements
Allows multiple null values
Index-based – elements can be accessed using index
Good for storing ordered data where duplicates matter

Common implementations:

ArrayList – fast access, slower insert/delete in middle
LinkedList – fast insert/delete, slower access
Vector – synchronized (legacy)

Typical use case:
When order matters and duplicates are allowed (e.g., list of students, products).

 */

public class List_Collection {

    public static void main(String[] args)
    {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java"); // duplicates allowed


        //add(element)
        list.add(1, "C++");


        //add(index, element)
        list.addAll(List.of("HTML", "CSS"));


        //Iterating a List

        //1. Using for loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

       //2️ Enhanced for-each loop

        for (String value : list) {
            System.out.println(value);
        }

        //3️ Using Iterator

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


 /*

         Name	                                          Description
void add(int index, E element)          	At the specified index, the element will be added
boolean addAll(int index, Collection c)   	Adds all elements in c to the list starting from the specified index
E get(int index)	                        Gets the element from the given index in the list
E remove(int index)	                        At the given index the element will be removed
ListIterator<E> listIterator()	            A list iterator is returned to iterate through the elements in the list


Accessing items in a collection is a very frequent and common operation.
Let us take a look at various ways of traversing the elements in a collection.

Iterator interface is used for the subclasses of Collection interface

enhanced for loop / for-each is used for unordered/ordered collections

for loop is used for ordered collections ex: Lists


The ListIterator, which is exclusive to lists, is similar to an Iterator. It allows bidirectional traversal and modification of elements.
Some useful additional methods of ListIterator are:

Name	                            Description
boolean hasPrevious()             	If there are elements available before the current element it returns true.
E previous()	                    The previous element in the list is returned.
void add(E e)                   	Adds the value to the list.
void set(E e)                   	The element returned by previous() or next() is replaced.


Apart from the methods provided by List, some methods exclusive to the LinkedList class are:

Name	                                        Description
void addFirst(E e)	                  Adds the value at the beginning of the list.
E removeLast()	                      The last element is removed and returned.
E removeFirst()                    	  The first element in the list is removed and returned.
E getLast()	                          The last element is returned.
E getFirst()	                      The first element is returned.
void addLast(E e)	                  Adds the value to the end of the list.

     */

}
