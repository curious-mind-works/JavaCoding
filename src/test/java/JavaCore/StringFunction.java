package JavaCore;

public class StringFunction {

    public static void main(String[] args)
    {

       /* 
        Reference Images src/RegularExpression Folder
        In Java, String is a class, not a primitive type. Strings are sequences of characters.

        1) String (Immutable):-

        > String objects are immutable, meaning once created, their content cannot be changed.
        > Any operation that appears to modify a String (e.g., concatenation) actually creates a new String object.
        > This immutability makes String objects thread-safe and suitable for use as keys in HashMaps.

        String Pool:-
        ------------
        > Java maintains a "String Pool" in the Heap to optimize memory usage.
        When you create a String literal (e.g., String s = "hello";), the JVM first checks if
        "hello" already exists in the pool. If it does, it returns a reference to the existing
        object; otherwise, it creates a new one and puts it in the pool.
       > Using new String("hello") always creates a new object in the Heap, even if "hello" is
        in the String Pool. */

        
        String s1 = "Ankit"; //liternal
        String s2 = new String("Ankit"); //Using new Keyword
        String s3 = "Ankit";
        String s4 = new String("Ankit");

        System.out.println(s1==s2);  //false
        
      // == compares references (memory addresses)
      // s1 → points to string pool
      // s2 → points to heap object
      // Different memory locations → false
        
        
        System.out.println(s1.equals(s2)); //true
        
      // .equals() compares content (values)
      // Both contain "Ankit"
      // Same content → true

         System.out.println(s1==s3);  // true

       // Both refer to the same object in String pool
        
         System.out.println(s1.equals(s3)); // true

       // Content is same ("Ankit")

         System.out.println(s2==s4); // false

       // new String() creates separate objects in heap
       // Different memory locations

         System.out.println(s2.equals(s4)); // true

       // Content is same ("Ankit")

        String s1 = "Ankit";
        String s2 = "An" + "kit";

        System.out.println(s1 == s2); //true

       // compile-time optimization → goes to String pool

         String s1 = "Ankit";
         String s2 = "An";
         String s3 = s2 + "kit";

         System.out.println(s1 == s3); //false

       // runtime concatenation → heap object

            
        String s = "Ankit";
        s.concat(" Sharma");

        System.out.println(s);

        // Answer: Ankit
        // Strings are immutable
  
        String s = "Ankit";
        s = s.concat(" Sharma");

        System.out.println(s);
       // Answer: Ankit Sharma

    String s1 = "Hello";
    String s2 = "World";
    String s3 = "HelloWorld";
    String s4 = s1 + s2;

    System.out.println(s3 == s4); //flase
       
    // runtime concatenation → new object

            
    String s1 = "HelloWorld";
    String s2 = "Hello" + "World";

    System.out.println(s1 == s2); //true

   // compile-time → same pool
   
    String s1 = "Hello";
    s1.concat(" World");

    System.out.println(s1); //Hello
         
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");

    System.out.println(sb); //Mutable
        
   // Output: Hello World

    String s1 = "Ankit";
	String s2 = "Ankit";
	s1 = s2;   
        
	System.out.println(s1); //Ankit
	System.out.println(s2); //Ankit
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1==s2); //true

    // Both "Ankit" go to String pool
    // Java reuses same object → same reference
    // s1 = s2 → no change (already same)

	String s1 = new String("Abhi");
	String s2 = new String("Abhi");
	s1 = s2;
		
	System.out.println(s1); //Abhi
	System.out.println(s2); //Abhi
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1==s2); //true

    // Two separate objects created in heap
    // Initially: different references 
    // Then: s1 = s2 → both point to same object   
    //Same reference → == true
    //Same content → equals true
		
	String s1 = "Ankit";
	String s2 = new String("Ankit");
	s1 = s2;
		
	System.out.println(s1); //Ankit
	System.out.println(s2); //Ankit
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1==s2); //true
        
   //s1 → String Pool
   //s2 → Heap object
   //Initially: different references 
   //Then: s1 = s2 → both point to heap object 
		
	String s1 = "Ankit";
	String s2 = new String("Ankit");
	s2 = s1;
		
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);  

   //s1 → String Pool
   //s2 → Heap initially
   //Then s2 = s1 → both point to pool object
    
    }
}
