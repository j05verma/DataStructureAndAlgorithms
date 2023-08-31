package com.jsp.Sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {-10, 20-5,16,55,86,-3};
		sort(arr, 0, arr.length-1);
		System.out.println("After QuickSort");
		System.out.println(Arrays.toString(arr));
	}
	  static void sort(int arr[],int low,int high){
	        if (low>=high){
	            return;
	        }
	        int s=low;
	        int e=high;
	        int m=s+(e-s)/2;  //m-> mid element
	        int pivot=arr[m]; //I am storing the mid element in Pivot

	        while (s<=e){
	            //also a reason why if its already sorted it will not swap
	            while (arr[s]<pivot){
	                s++;
	            }
	            while (arr[e]>pivot){
	                e--;
	            }

	            if (s<=e){
	                int temp=arr[s];
	                arr[s]=arr[e];
	                arr[e]=temp;
	                s++;
	                e--;
	            }
	        }
	        //now my pivot is at correct index, please sort two halves now
	        sort(arr,low,e);
	        sort(arr,s,high);
	    }

}
