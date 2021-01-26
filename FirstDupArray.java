package com.array;

public class FirstDupArray {

	public static void main(String[] args) {

		int a[]={6,5,1,2,5,4,8,2,7};
		
		for(int i=0; i<a.length; i++)
		{
			int temp=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("First Dublicate number is "+a[i]);
					temp=temp+1;
					break;
				}
			}
			
			if(temp>0)
			{
				break;
			}
		}
		
	}

}
