package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*

🔹 Set – Properties (Java Collection)

Does NOT allow duplicate elements
No index-based access
Allows at most one null value (depends on implementation)
Used to store unique elements
Insertion order is not guaranteed (except some implementations)

Common implementations:

HashSet – no order, fast performance
LinkedHashSet – maintains insertion order
TreeSet – sorted order (ascending by default)

Typical use case:

When uniqueness is required (e.g., unique IDs, email addresses).

 */

public class Set_Collection
{
    public static void main(String[] args)
    {

        Set<String> set = new HashSet<>();

        // add(element)

        set.add("Java");
        set.add("Selenium");
        set.add("Java"); // duplicate → ignored

       // addAll(elements)

        set.addAll(Set.of("API", "TestNG"));

        //Iterating a Set

        //1️ Enhanced for-each loop

        for (String value : set) {
            System.out.println(value);
        }

        //2 Using Iterator

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
