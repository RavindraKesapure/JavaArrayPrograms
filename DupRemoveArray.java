package com.array;
import java.util.*;
public class DupRemoveArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
	    int size=sc.nextInt();
		
	    System.out.println("Enter the "+size+" Element in Array");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
		  for(int j=i+1; j<size; j++)	
		  {
			if(a[i] == a[j])
			{
				for(int k=j; k<size; k++)
				{
					a[k]=a[k+1];
				}
				size--;
			}
		  }
		}	
		System.out.println("Display");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
	}

}
