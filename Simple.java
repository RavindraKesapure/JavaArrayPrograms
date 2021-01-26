package com.array;

public class Simple {

	public static void main(String[] args) {

		String str="aabbccdaaeff";
		char[] ch=str.toCharArray();
		boolean visit[]=new boolean[str.length()];
		int count=0;
		//int st=42;
		for(int i=0; i<str.length(); i++)
		{
		    count=0;
		    int k=0;
			for(int j=0; j<str.length(); j++)
			{
				if(ch[i]==ch[j] && !visit[j])
				{
					visit[j]=true;
					count++;
				}
			}	
		
			if(count>=2)
			{ 
				
				  System.out.println(ch[i]+"==> "+count);	
			}
			
			
			
		}
		
		
	}

}
