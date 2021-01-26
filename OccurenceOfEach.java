package com.array;

import java.util.Scanner;

public class OccurenceOfEach {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
	   char ch[]=str.toCharArray();
	   int st=str.length(),count=0,cnt=0;
	   boolean b[]=new boolean[st];	
	   
	   for(int i=0;i<st;i++)
	   {     count=0;
		   for(int j=0;j<st;j++)
		   {
			   if(ch[i]!=ch[j] && !b[j])
			   { 
				   break;
			   }  
			   if(ch[i]==ch[j] && !b[j])
			   {
				   b[j]=true;
				   count++;
			   }
		   }  
		   if(count>=1)
		   {   cnt++;
			   System.out.println(ch[i]+" "+count);
		   }
	   }
	   if(cnt==st)
	   {
		   System.out.println("string are unique "+str);
	   }
	}

}
