package stringsQuestions;

public class StringWordsLength {

    public static void main(String[] args)
    {

        String s = "Hello to the Homies";

        String []split = s.split(" ");

        for(int i=0; i<split.length;i++)
        {

                System.out.println("It is the word : " +split[i]+" - "+split[i].length());



        }


    }

}
