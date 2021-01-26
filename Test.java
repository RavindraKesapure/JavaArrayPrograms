package com.array;

import java.util.Scanner;

class demo
{
	int data;
	demo link;
	
	public demo(int data,demo link)
	{
		this.data=data;
		this.link=null;
	}
}
public class Test
{
	static  Scanner sc=new Scanner(System.in);
	static demo root =null;
	
	public static void main(String x[])
	{
		
		insert();
		
	}

	private static void insert() {
		
	  int no;
	  demo temp ;
	  System.out.println("Enter the Number");
	  no=sc.nextInt();
	  
	  temp=new demo(no,null);
	  
	  if(root == null)
	  {
		  root = temp ;  
	  }
	  else
	  {
		  demo p= root; 
		  while(p.link!=null)
		  {
			  p=p.link;
		  }
		  
		  p.link=temp;
		  System.out.println("data insert "+temp.data);
	  }
	  
		
	}
}