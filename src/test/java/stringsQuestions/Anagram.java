package stringsQuestions;

public class Anagram {

    public static void main(String[] args)
    {

    // a word or phrase that is made by arranging the letters of another word or phrase in a different order
    // "astronomer" becomes "moonstarer".

        String a = "sdss";
        String b = "ssss";

        boolean flag = true;

        int count[] = new int[256];

        for(int i=0; i<a.length(); i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;

        }

      for(int i=0; i<count.length;i++)
      {
          if(count[i]!=0)
          {
              flag = false;
              break;
          }

      }

      System.out.println(flag);



    }

}
