package otherConceptsQuestion;

public class SortingOfArray {

    public static void main(String[] args)
    {

        int arr[] = {2,44,55,3,67,222,43,7};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {

                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }


            }

        }

       for(int i=0; i<arr.length; i++)
       {
           System.out.println(arr[i]);
       }



    }

}
