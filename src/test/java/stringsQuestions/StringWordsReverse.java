package stringsQuestions;

public class StringWordsReverse {

    public static void main(String[] args)
    {

        String s = "Hello Sanu to this World";

        String split[] = s.split(" ");

        for(int i=split.length-1; i>=0; i--)
        {

            System.out.print(split[i]+" ");

        }

    }


}
