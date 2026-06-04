package JavaCore;

public class RegularEpression {

    public static void main(String[] args)
    {

        String s = "s";

        // [] - use for match a single character
        System.out.println(s.matches("[s]"));

        // single character between range a-z
        System.out.println(s.matches("[a-z]"));

        // single character can be in range
        System.out.println(s.matches("[a-zA-Z0-9]"));


        String a = "sanuverma@com";

        System.out.println(a.matches("[a-z]{5,}[@]com"));

        String b = " ";

        System.out.println(b.matches("\\s"));








    }

}
