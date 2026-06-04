package otherConceptsQuestion;

public class PalindromeNumber {

    public static void main(String[] args)
    {

        int num = 123821;
        String s = String.valueOf(num);
        String rev = "";

        for(int i=0; i<s.length(); i++)
        {
            rev = s.charAt(i)+ rev;

        }

        if(rev.equals(s))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }

}
