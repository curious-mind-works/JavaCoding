package otherConceptsQuestion;

public class SmallestElementInArray {

    public static void main(String[] args)
    {

        int arr[] = {22,55,11,35,65,234,12,65};

        int min = arr[0];

        for(int i=1; i<arr.length; i++)
        {

            if(min>=arr[i])
            {
                  min = arr[i];
            }


        }

        System.out.println("Smallest no. is : "+min);

    }

}
