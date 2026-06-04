package JavaCore;

public class StringFunction {

    public static void main(String[] args)
    {

        String s1 = "Ankit"; //liternal
        String s2 = new String("Ankit"); //Using new Keyword

        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2)); //true




    }
}
