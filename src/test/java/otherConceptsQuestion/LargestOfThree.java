package otherConceptsQuestion;

public class LargestOfThree {

    public static void main()
    {

        int n1 = 57;
        int n2 = 59;
        int n3 = 9;

        if(n1>=n2 && n1>=n3)
        {
            System.out.println("N1 : "+n1);
        }
        else if (n2>=n1 && n2>=n3)
        {
            System.out.println("N2 : "+n2);
        }
        else
        {
            System.out.println("N3 : "+n3);
        }



    }


}
