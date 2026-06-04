package stringsQuestions;

public class StringPalindrome {

    public static void main(String [] args)
    {

        String s = "sabjjbas";
        String temp = "";

        for(int i=0; i<s.length(); i++)
        {


            temp = s.charAt(i) + temp;

        }


        if(s.equals(temp))
        {
           System.out.println("Yes it is ");
        }
        else
        {
            System.out.println("No it is not");
        }



    }



}
