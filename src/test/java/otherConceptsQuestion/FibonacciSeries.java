package otherConceptsQuestion;

public class FibonacciSeries {

    public static void main(String[] args)
    {

        int num = 10;
        int n1 = 0;
        int r = 0;
        int n2 = 1;


        System.out.print(n1 + " "+n2+ " ");


        for(int i = 3 ; i<=num; i++)
        {

            r = n1 + n2;

            System.out.print(r+ " ");

            n1 = n2;
            n2 = r;
        }






    }
}
