package stringsQuestions;

public class CountVowelConsonentWords {

    public static void main(String[] args)
    {

        // 65 - A, 90 - Z, 97 - a, 122 - z

        String s = "Hello My name is John Scena";

        int vowelCount = 0;
        int wordCount = 0;
        int upperCount = 0;

        if(s.charAt(0)!= ' ')
        {
            wordCount++;
        }

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

           if(c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u' || c == 'A' || c == 'E' || c == 'I' || c =='O'||c=='U' )
           {
               vowelCount++;
           }

//           if(c==' ' &&  !=' ')
//           {
//               wordCount++;
//           }

        }

        System.out.println("Vowel Count is : "+vowelCount);
        System.out.println("word Count is : "+wordCount);
        System.out.println("Upper Case Count is : "+upperCount);

    }

}
