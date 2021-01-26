package com.array;
import java.util.*;
public class UniqueElementInArray {
	
	public static void uniqueApp(int a[],int n)
	{
		int count;
		for(int i=0;i<n;i++)
		{
			 count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}	
			if(count==1)
			{
				System.out.println("Unique Element "+ a[i]+" = " +count );
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50],n,i;
		System.out.println("Enter the Array size");
		n=sc.nextInt();
		
		System.out.println("Enter the "+n+" Elenment in Array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		uniqueApp(a,n);


	}

}
