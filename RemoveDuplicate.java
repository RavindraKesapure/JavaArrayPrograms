package com.array;

import java.util.Arrays;

public class RemoveDuplicate {

		public int duplicate(int arr[],int n)
		{ 
			if(n==0 || n==1)
			{
				return n;
			}
			
			int temp[]=new int[n];
			int j=0;
			
			for(int i=0; i<n-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					temp[j++]=arr[i];
				}
				
			}
			
			for(int i=0; i<j; i++)
			{
				arr[i]=temp[i];
			}
			temp[j++]=arr[n-1];
			return j;
			
		}
			
		public static void main(String[] args) {
	 
			int arr[]= {1,2,3,2,1,4,5,3};
			Arrays.sort(arr);
			
			int n=arr.length;
			RemoveDuplicate dc=new RemoveDuplicate();
			dc.duplicate(arr,n);
			
			for(int i=0; i< n; i++)
			{
				System.out.print(arr[i]+" ");
			}
	}

}
