package com.currencyDenominations.sorting;

public class MergeSort {
	
	public void printArray(int array[],int length)
	{
	     System.out.print("The elements of the given array are: ");
	     for(int i=0;i<length;i++)System.out.print(array[i]+" ");
	}
	
	public void merge(int array[], int lower, int middle, int upper) 
	{ 
	    int i, j, k; 
	    int left[]=new int[middle-lower+1];//creating sub-array to store elements in the left portion of 'array[]'
	    int right[]=new int[upper-middle];//creating sub-array to store elements in the right portion of 'array[]'
	    for (i = 0; i < middle-lower+1; i++)//copying appropriate elements from array[] to left[]
	    left[i] = array[lower + i];
	    for (j = 0; j < upper-middle; j++)//copying appropriate elements from array[] to right[] 
	        right[j] = array[middle + 1 + j];
	    i = 0; // initial index of sub-array left[] 
	    j = 0; // initial index of sub-array right[]
	    k = lower; //initial index of merged array 
	    for (k=lower;i < middle-lower+1 && j < upper-middle;k++) 
	    {//THIS CONDITION SORTS IN ASCENDING ORDER 
	        if (left[i] <= right[j]) array[k] = left[i++];//storing value of left[i] in array[k] if the former is smaller
	        else array[k] = right[j++];//storing value of right[j] in array[j] if the former is smaller
	    }
	    while (i < middle-lower+1) array[k++] = left[i++];//copying back the remaining elements of left[] to array[]
	    while (j < upper-middle) array[k++] = right[j++];//copying back the remaining elements of right[] to array[]
	}
	
	public void mergeSort(int array[],int lower,int upper)
	{
	     if(lower>=upper)return;//signifies that array contains only one element
	     mergeSort(array,lower,(lower+upper)/2);//sorting the left portion of the array
	     mergeSort(array,((lower+upper)/2)+1,upper);//sorting the right portion of the array
	     merge(array,lower,(lower+upper)/2,upper);//merging the two portions once sorting is done
	}

}
