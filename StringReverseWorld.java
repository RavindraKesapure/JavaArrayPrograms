package com.array;

import java.util.Scanner;

public class StringReverseWorld {

	public static void main(String[] args) {

		  System.out.println("enter the string");
	      Scanner scan=new Scanner(System.in);
	      String str=scan.nextLine();
	      char[] ch = str.toCharArray();  
	      //declaring empty String to hold output
	      String result="";
	      
	      for (int i = ch.length-1; i >=0; i--)
	      {         
	         int k=i;  
	         //Iterating from the end until i points to space
	         while (i>=0&&ch[i]!=' ')
	         {                       
	            i--;                 
	         }
	         int j=i+1;
	         //int j=i+1;
	         //copying words into result string
	         while (j<=k)
	         {
	            result=result+ch[j];//Concatinate the string using "+" operator
	            j++;
	         }
	       result=result+" ";
	      }
	      System.out.println(result);
	}

}
