package JavaCore;

public class StringFunction {

    public static void main(String[] args)
    {

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
      //  Same content → true

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

System.out.println(s1 == s2);

        👉 Answer: true
✅ Reason: compile-time optimization → goes to String pool

            String s1 = "Ankit";
String s2 = "An";
String s3 = s2 + "kit";

System.out.println(s1 == s3);

        👉 Answer: false
✅ Reason: runtime concatenation → heap object

            
String s = "Ankit";
s.concat(" Sharma");

System.out.println(s);
👉 Answer: Ankit
✅ Reason: Strings are immutable

    
String s = "Ankit";
s = s.concat(" Sharma");

System.out.println(s);
System.out.println(s);Show more lines
👉 Answer: Ankit Sharma

    String s1 = "Hello";
String s2 = "World";
String s3 = "HelloWorld";
String s4 = s1 + s2;

System.out.println(s3 == s4);
        👉 Answer: false
✅ runtime concatenation → new object

            
String s1 = "HelloWorld";
String s2 = "Hello" + "World";

System.out.println(s1 == s2);
👉 Answer: true
✅ compile-time → same pool

    
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

System.out.println(sb);

        👉 Output: Hello World
            

    }
}
