package stringsQuestions;

public class StringNumberOfWords {

    public static void main(String[] args)
    {

        String s = "Hello          Welcome to     this World  f ";


        int count = 0;

        if(s.charAt(0)!=' ')
        {
            count++;
        }

        for(int i=0; i<s.length()-1;i++)
        {

            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }

        }

        System.out.println(count);



    }

}
