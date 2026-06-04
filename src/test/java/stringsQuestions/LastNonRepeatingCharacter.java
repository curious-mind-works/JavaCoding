package stringsQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatingCharacter {

    public static void main(String args[])
    {

        String s = "behakbakjuierh";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray())
        {

            map.put(c, map.getOrDefault(c,0)+1);

        }

     for(int i = s.length()-1; i>=0; i--)
     {
         if(map.get(s.charAt(i))==1)
         {
             System.out.println(s.charAt(i));
             break;
         }

     }

    }
}
