package stringsQuestions;

public class StringPanagram {

    public static void main(String[] args)
    {

        // contains all words

        String s = "The quick brown fox jumps over the lazy dog";

        String m=s.toLowerCase();

        boolean flag = true;

        for(char c = 'a'; c<='z'; c++)
        {
            if(m.indexOf(c)<0)
            {
                flag = false;
            }


        }

        System.out.println("Here is the : "+flag);



    }
}
