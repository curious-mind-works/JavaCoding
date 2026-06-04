package stringsQuestions;

public class StringCharacterReverse {

    public static void main(String[] args)
    {

        String s = "SanuHere";
        String temp = "";

        for(int i=0; i<s.length(); i++)
        {

            temp = s.charAt(i) + temp;

        }

        System.out.println(temp);

    }

}
