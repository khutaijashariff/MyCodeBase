package CrackingTheCodingInterviewBook.SearchingAndSorting;

import java.util.Scanner;

/**
 * Created by ANJALI on 2/26/2017.
 */

/* You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
Write a method to merge B into A in sorted order.
 */

class SortedMerge {
   private int[] arrA,arrB;
   private int sizeA,sizeB;
    /* USES SIMPLE MERGE AND SORT
    int[] sortedMerge(int[] arrA,int[] arrB)
    {
        int merged=arrA.length-1;
        for(int arrBElt:arrB)
        {
            arrA[merged]=arrBElt;
            merged--;
        }
        Algos.Sorts.QuickSort.qSort(arrA,0,arrA.length-1);
       return arrA;
    }*/
    private void inputForSortedMerge()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("****Sorted Merge***");
        System.out.println("Enter the number of elements in A");
        sizeA=s.nextInt();
        System.out.println("Enter the number of elements in B");
        sizeB=s.nextInt();
        arrA=new int[sizeA+sizeB];
        arrB=new int[sizeB];
        System.out.println("Enter the elements for A");
        for(int i=0;i<sizeA;i++)
            arrA[i]=s.nextInt();
        System.out.println("Enter the elements for B");
        for(int i=0;i<sizeB;i++)
            arrB[i]=s.nextInt();
    }
   private int[] sortedMerge()
    {
       int indexA=sizeA-1;
       int indexB=sizeB-1;
       int mergedIndex=(sizeA+sizeB)-1;

       while(indexB>=0) //Since arrA is already sorted, the only condition required is to insert arrB elements in order
       {
          if(indexA>=0 && arrA[indexA]>arrB[indexB] )
           {
               arrA[mergedIndex]=arrA[indexA];
               indexA--;
           }
           else
           {
               arrA[mergedIndex]=arrB[indexB];
               indexB--;
           }
           mergedIndex--;
       }


     return arrA;
    }

    public static void main(String args[])
    {
        SortedMerge sm=new SortedMerge();
        sm.inputForSortedMerge();
        for(int i:sm.sortedMerge())
            System.out.print(i+"\t");
    }
}
