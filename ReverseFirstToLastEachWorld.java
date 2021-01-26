package com.array;

public class ReverseFirstToLastEachWorld {

	public static void main(String[] args) {
		String str="Good Morning India";
		char ch[]=str.toCharArray();
		int len=str.length();
		
		String result="";
	      
	      for (int i=0;i<len;i++)
	      {         
	         int k=i;  
	         while (i<len && ch[i]!=' ')
	         {                       
	            i++;                 
	         }
	         int j=i-1;
	        
	         while (k<=j)
	         {
	            result=result+ch[j];
	            j--;
	         }
	       result=result+" ";
	      }
	      System.out.println(result);
		
		
	}

}
