package stringsQuestions;

public class StringVowelAndConsonentCount {

    public static void main(String[] args)
    {

        String k = "iabisuiysnjayui";
        String s = k.toLowerCase();

        int vowel = 0;
        int consonent = 0;

        for(int i=0; i<s.length(); i++)
        {


            String str = String.valueOf(s.charAt(i));

            if(str.matches("[aeiou]"))
            {
                vowel++;
            }
            else
            {
                consonent++;
            }


        }

        System.out.println("Vowel : "+vowel+" Consonent : "+consonent);



    }
}
