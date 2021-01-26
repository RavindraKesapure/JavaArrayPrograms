package com.array;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int no=arr.length;
		int i=0,temp,j=no-1;
		
		System.out.println("Array Value is");
		for(int a=0; a<no; a++)
		{
			System.out.print(arr[a]+" ");
		}
		
		while(i < j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
		System.out.println("\nReverse Array is");
		for(int a=0; a<no; a++)
		{
			System.out.print(arr[a]+" ");
		}
	}

}
