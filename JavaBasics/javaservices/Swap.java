package JavaBasics.javaservices;

/**
 * Created by ANJALI on 01/30/17.
 */
public class Swap {
   public static void swapArray(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
