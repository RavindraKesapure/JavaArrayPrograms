package com.array;

public class DupTwoArray {

	public static void main(String[] args) {
		int a[]={21,33,45,67,86,55};
		int b[]={44,87,21,63,55,99,67,86};
		int k=0,p=0;
		int m[]=new int[10];
		for(int i=0; i<a.length; i++)
		{
		  for(int j=0; j<b.length; j++)	
		  {
			if(a[i]==b[j])
			{
				m[p]=m[p]+b[j];
				p++;
			}
		  }
		}	
		
		System.out.println("Display");
		for(int i=0; i<p; i++)
		{
			System.out.println(m[i]);
		}
	}

}
