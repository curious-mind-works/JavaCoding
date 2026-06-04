package otherConceptsQuestion;

public class CountDigitsInInteger {

    public static void main(String[] args)
    {

        int num = 34344;
        int count = 0;

        while(num!=0)
        {
            num = num/10;
            count++;

        }

        System.out.println(count);

        // 3/10 = 0, 3%10 = 3


    }
}
