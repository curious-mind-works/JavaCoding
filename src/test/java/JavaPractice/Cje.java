package JavaPractice;

public class Cje {

    public static void main(String[] args)
    {

        String s = "gy^bh8u&*hnjkebB*&ggq&";

        String temp2 = "";

        int k = s.length()-1;

        for(int i=0; i<s.length(); i++)
        {
            String c = String.valueOf(s.charAt(i));


            if(c.matches("[^A-Za-z0-9]"))
            {

               temp2 = temp2 + c;

            }
            else
            {


                while(String.valueOf(s.charAt(k)).matches("[^A-Za-z0-9]")) {

                  k--;

                }


                    temp2 = temp2 + String.valueOf(s.charAt(k));


                k--;
            }

        }

        System.out.println(temp2);
    }

}
