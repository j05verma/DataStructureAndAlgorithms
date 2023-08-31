package com.jsp.Sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr= {6,2,9,32,7,41,19,45};
		int[] sort=divide(arr);
		System.out.println("After MergeSort");
		for (int a : sort) {
			System.out.print(a+" ");
		}
	}
	public static int[] divide(int[] arr) {
		if(arr.length==1) // Once length becomes one stop dividing
			return arr;
		int mid=(arr.length)/2; // find mid
		int[] left=divide(Arrays.copyOfRange(arr, 0, mid)); // left array
		int[] right=divide(Arrays.copyOfRange(arr, mid, arr.length)); // right array
		return merge(left, right); //merging of left and right sorted array
	}
	public static int[] merge(int[] l, int[] r)
	{
		int[] m=new int[l.length+r.length];
		// i belongs to left
		// j belong to right
		// k belongs to merge
		int i=0, j=0, k=0;
		while(i<l.length && j<r.length) // if any one exceeds the index the stop
		{
		if(l[i]<r[j]) // if left is small add it to merge array
			m[k++]=l[i++];
		else        // if right is small add it to merge array
			m[k++]=r[j++];
		}
		// if i doesn't exceeds range add remaining elements of left into the merge array
		while(i<l.length)
			m[k++]=l[i++];
		// if j doesn't exceeds range add remaining elements of right into the merge array
		while(j<r.length)
			m[k++]=r[j++];
		return m; // return sorted and elements from left and right
	}

}
