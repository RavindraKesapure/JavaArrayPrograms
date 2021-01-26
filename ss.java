package com.array;
import java.util.*;

class A
{
	  public void add(int a)
	  {
		  System.out.println("Int method "+a);
		 // return a;
	  }
}
class B extends A
{
	   public void add(int a)
	   {
		   System.out.println("Override");
	   }
}
public class ss
{	
	public static void main(String x[])
	{  
	   A aa=new A();
	   aa.add(100);
	}
}
 