package com.array;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		int len,i=0,j,k,count=0;
		char ch[]=str.toCharArray();
		len=str.length();
		j=len-1;
		k=j/2;
		while(i<k)
		{
			if(ch[i]!=ch[j])
			{
				break;
			}
			else
			{
				count++;
				i++;
				j--;
			}
		}
		
		if(k==count)
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is Not Pallindrome");
		}
	}
}
