package Algos.Sorts;

import JavaBasics.javaservices.Swap;
/**
 * Created by ANJALI on 01/30/17.
 */
public class BubbleSort {
    public static void bSort(int arr[])
    {
        for(int i=0;i<=arr.length;i++) //picks an element
        {
            for(int j=1;j<arr.length-i;j++) //always starts with 1 and goes till arr.len -i bcos the last i elements would be in the right place
            {
                if(arr[j-1]>arr[j]) // compares every element with the previous elemnt
                                      // pushes bigger number to the end of the array
                    Swap.swapArray(arr, j - 1, j);
            }
        }
    }
}
