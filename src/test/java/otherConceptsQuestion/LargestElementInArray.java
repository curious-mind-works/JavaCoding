package otherConceptsQuestion;

public class LargestElementInArray {

    public static void main(String[] args)
    {

        int arr[] = {22,44,66,88,33,45,76,34,83,22};

        int num = arr[0];

        for(int i=1; i<arr.length; i++)
        {

            if(num<=arr[i])
            {
                num = arr[i];
            }


        }

        System.out.println("Largest is : "+num);



    }

}
