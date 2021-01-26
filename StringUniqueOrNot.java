package com.array;

import java.util.Scanner;

public class StringUniqueOrNot {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
	   char ch[]=str.toCharArray();
	   int st=str.length(),count=0,cnt=0;
	 //  boolean b[]=new boolean[st];	
	   
	   for(int i=0;i<st;i++)
	   {    count=0;
		   for(int j=0;j<st;j++)
		   {
			  if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || ch[i]>='1' && ch[i]<='9')
			  {
				  if(j<i  && ch[i]==ch[j])
				  {
					  break;
				  }					  
				  else if(ch[i]==ch[j])
				  {
					  count++;
				  }
			  }
		   }  
		   if(count==1)
		   {
			   cnt++;
			   //System.out.println("String is unique");
		   }
		   else
		   {
			   cnt=0;
			   System.out.println("String is dublicte");
			   break;
		   }
	   }   
	   if(cnt==st)
	   {
		   System.out.println("Unique String");
	   }
	}

}
