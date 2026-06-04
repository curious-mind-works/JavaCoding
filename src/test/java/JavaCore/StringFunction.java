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

    }
}
