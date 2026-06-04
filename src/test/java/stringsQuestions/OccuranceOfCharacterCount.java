package stringsQuestions;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterCount {

    public static void main()
    {

        String s = "aafffeefrefefwewrgrgg";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> it : map.entrySet())
        {
            System.out.println(it.getKey()+" : "+it.getValue());
        }


    }

}
