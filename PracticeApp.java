package com.array;

  class PracticeApp{ 
	  public static void main(String[] args) {
		
		  int a[]={10,0,-1,20,25,30 };
		  int i=0,j=0,k=0,l=0;
		  int sum=15;
		  
		  while(i<a.length)
		  {
			  if(a[i]==sum)
			  {
				  System.out.println(a[i]);  
			  }
			  else if(j>a.length)
			  {
				  j=0;
				  i++;
			  }
			  else if(a[i]+a[j]==sum)
			  {
				  System.out.println("["+a[i]+" "+a[j]+"]");
				  j++;
				  break;
			  }
			  else
			  {
				  j++;
			  }
			  
			  while(k<a.length)
			  {
				  if(a[i]+a[j]+a[k]==sum)
				  {
					  System.out.println("["+a[i]+" "+a[j]+" "+a[k]+"]");    
					  break;
				  }
				  else if(l>a.length)
				  {
					  l=0;
					  k++;
				  }
				  else if(a[i]+a[j]+a[k]+a[l]==sum)
				  {
					  System.out.println("["+a[i]+" "+a[j]+" "+a[k]+" "+a[l]+"]");  
					  break;
				  }
				  else
				  {
					  k++;
				  }
			   }
		  }
      } 
 }
 