package Sorts;

import javaservices.Swap;

/**
 * Created by ANJALI on 01/30/17.
 */
 class QuickSort {
   public static void qSort(int[] arr, int start,int end)
    {
        if(start<end) //base condition: till start and/or end cross each other
        {
            int mid=partition(arr,start,end);
            qSort(arr,start,mid-1);
            qSort(arr,mid+1,end);
        }
    }
    static int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot) //the element lesser than pivot is pushed to front
            {
                i++;
                Swap.swapArray(arr,i,j);
            }
        }
        //now, elements before i are less than pivot and the elements after i  except the last element are greater than pivot
        i++;
        Swap.swapArray(arr,i,end); //moves the pivot element to the correct position
        return i;
    }
}
