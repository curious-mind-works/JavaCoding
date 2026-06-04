package stringsQuestions;

public class StringComparewithoutBuiltInMethod {

    public static void main(String[] args)
    {

        String s1 = "Sanu";
        String s2 = "Sank";

        int count = 0;

        if(s1.length()==s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                char a = s1.charAt(i);
                char b = s2.charAt(i);

                if(a==b)
                {
                    count++;
                }

            }

            if(count == s1.length())
            {
                System.out.println("Equal");
            }
            else
            {
                System.out.println("Not Equal");
            }

        }
        else{

            System.out.println("Not Equal");
        }



    }
}
