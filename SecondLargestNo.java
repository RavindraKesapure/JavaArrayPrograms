package com.array;

public class SecondLargestNo {

	public static void main(String[] args) {

		int temp;
		int a[]= {5,7,1,6,3,9,4,2,8};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Element is "+a[1]);
		
		
	}

}
