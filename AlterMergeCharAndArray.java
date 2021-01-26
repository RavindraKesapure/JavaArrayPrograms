package com.array;

public class AlterMergeCharAndArray {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		char b[]={'a','b','c','d'};
		int i,k=0;
		char c[]=new char[8];
		for(i=0;i<4;i++)
		{
			if(i<4)
			{
				c[k++]=((char)a[i]);
			}
			if(i<4)
			{
				c[k++]=b[i];
			}
		}
		for(i=0;i<8;i++)
		{
			if(i%2==0)
		         System.out.print("\t"+(int)c[i]);
			else 
				 System.out.print("\t"+c[i]);	
		}
		

	}

}
