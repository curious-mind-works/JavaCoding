package JavaPractice;

public class NumRev {

    public static void main(String[] args)
    {

        int num = 123456;
        int temp = 0;

        while(num!=0)
        {

            int temp1 = num % 10;
            temp = temp*10 +temp1;
            num= num/10;


        }


        System.out.println(temp);

    }

}
