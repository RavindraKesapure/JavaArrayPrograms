package com.array;

public class StringReverseWithoutAffSpecialChar {

	
	public String ReverseApp(String str)
	{
		    char ch[]=str.toCharArray();
	        int i=0,j,len;
	        
	        len=str.length();
	        j=len-1;
	        
	        while(i<j)
	        {
	        	 if (!cheak(ch[i])) 
	                 i++; 
	        	 
	             else if(!cheak(ch[j])) 
	                 j--; 
	        	 
	           	 else
	        	 {
	        		char temp=ch[i];
	        		ch[i]=ch[j];
	        		ch[j]=temp;
	        		
	        		i++;
	        		j--;
	        	 }
	        } 
	        str=new String(ch);
			return str;
	}
	
	
	public boolean cheak(char ch)
	{
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		    String str="%Ravi*ndra.$!!is.*Good&^,Boy#";
		        
		    StringReverseWithoutAffSpecialChar sr=new StringReverseWithoutAffSpecialChar();
		    String rev=sr.ReverseApp(str);
		    
		    System.out.println(rev);
		    
	       
	}

}
