package otherConceptsQuestion;

public class AlphabetPattern {

    public static void main()
    {

        int n = 5;

        for(int i=1; i<=n; i++)
        {
            char c = 'A';

            for(int j=0; j<i;j++)
            {
                System.out.print(c);
                c++;
            }

            System.out.println("");
        }



    }

}
