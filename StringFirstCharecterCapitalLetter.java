package com.array;

import java.util.Scanner;

public class StringFirstCharecterCapitalLetter {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String");
	        String str=sc.nextLine();
	        char ch[]=str.toCharArray();
	        int len=str.length();
	        
	        for(int i=0;i<len;i++)
	        {
	        	if(ch[0]>='a'  &&ch[0]<='z')   //cheak string first chareter capital or not
	        	{
	        		 ch[0]=(char)(ch[0]-32);
	        	}
	        	else if(ch[i]==' ')   //cheak condition the string having space or not
	        	{
	        	  int k=i+1;
	        	  if(ch[k]>='a' && ch[k]<='z')
	        	  {
	        		 ch[k]=(char)(ch[k]-32);   //convert small letter to capital letter
	        		   
	        	  }
	        		ch[i+1]=ch[k];
	        	  }
	        }  
	        
	        str=new String(ch); // convert charecter array to string 
	        
	        System.out.println(str);  //display string 
	}

}
