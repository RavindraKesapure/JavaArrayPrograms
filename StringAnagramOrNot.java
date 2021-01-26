package com.array;

import java.util.Scanner;

public class StringAnagramOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str=sc.next();
		
		System.out.println("Enter the Second string");
		String str2=sc.next();
		int len1,len2,i,j,count=0;
		len1=str.length();
		len2=str.length();
		boolean b[]=new boolean[len2];
		char ch[]=str.toCharArray();
		char ch1[]=str2.toCharArray();
		
		
		if(len1==len2)
		{
			   
			   for(i=0;i<len1;i++)
			   {
				    for(j=0;j<len2;j++)
				    {
				    	if(ch[i]==ch1[j]  && !b[j])
				    	{
				    		b[j]=true;
				    		count++;
				    		break;
				    	}
				    }
			   }	
		}
		
		if(count==len1)
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not Anagram String");
		}
		
		
	}

}
