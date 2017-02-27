package CrackingTheCodingInterviewBook.SearchingAndSorting;

/**
 * Created by ANJALI on 2/26/2017.
 */
import Algos.Sorts.*;
class SortedMerge {
    int[] sortedMerge(int[] arrA,int[] arrB)
    {
        int merged=arrA.length-1;
        for(int i=0;i<arrB.length;i++)
        {
            arrA[merged]=arrB[i];
            merged--;
        }
        Algos.Sorts.QuickSort.qSort(arrA,0,arrA.length-1);
       return arrA;
    }
    public static void main(String args[])
    {
        int[] arrA={3,9,10,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] arrB={1,4,5};
        SortedMerge sm=new SortedMerge();
        sm.sortedMerge(arrA,arrB);
        for(int i:arrA)
            System.out.print(i +"\t");
    }
}
