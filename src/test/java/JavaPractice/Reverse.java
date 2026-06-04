package JavaPractice;

public class Reverse {

    public static void main(String args[])
    {

        String s = "Welcome to PwC";

        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++)
        {

            for(int j=str[i].length()-1; j>=0; j--)
            {

                System.out.print(str[i].charAt(j));

            }

            System.out.print(" ");
        }


    }


}
