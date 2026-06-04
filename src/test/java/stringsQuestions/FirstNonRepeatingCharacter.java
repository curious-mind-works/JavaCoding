package stringsQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args)
    {

        String s = "ankitaith";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray())
        {

            map.put(c,map.getOrDefault(c,0)+1);


        }

        for(Map.Entry<Character,Integer> it : map.entrySet())
        {


            if(it.getValue()==1) {


                System.out.println("The Character is : " + it.getKey() + ", Value : " + it.getValue());

                break;
            }
        }



    }
}
