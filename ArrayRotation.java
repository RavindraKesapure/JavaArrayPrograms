package com.array;

import java.util.*;
public class ArrayRotation {
	public static void main(String[] args) {
		
		int a[]=new int[20];
		int n,i,j,count=0,max=0,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		
		System.out.println("Enter the "+n+" element in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}			
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				  if(j<i && a[i]==a[j])
				  {
					  break;
				  }
				  else if(a[i]==a[j])
				  {
					  count++;
				  }
			}	
			if(count>0)
			{
				if(count%2==0)
				{
					System.out.println("value of max = "+count+ " number is even "+a[i]);
				}
			/*	else
				{
					System.out.println("value of max = "+max+ "number is odd "+m);
				}   */
			}	
		}
		
	}
}
