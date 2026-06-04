package otherConceptsQuestion;

public class ReverseOfANumber {

    public static void main(String[] args)
    {

        int num = 32314;
        int rev = 0;

        while(num!=0)
        {

            int temp = num%10;

            rev = rev * 10 + temp;

            num = num/10;




        }

        System.out.println("Reverse num is : "+rev);


    }

}
