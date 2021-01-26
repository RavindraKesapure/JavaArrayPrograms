package com.array;

import java.util.Scanner;

public class ArmstrongNumber {

	static int sum1=0;
	public static int funApp(int n,int count)
	{
		int c=count;
		int num=1,num1=n%10;
		if(n==0)
		{
			return sum1;
		}
		else
		{
			while(count>0)
			{
				num=num*num1;
				count--;
			}
			sum1=sum1+num;	
			n=n/10;
			funApp(n,c);
		}
		return sum1;
		
	}
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n,count=0;
	System.out.println("Enter the number");
	n=sc.nextInt();
	int temp=n;
	while(n!=0)
	{
		n=n/10;
		count++;
	}
	n=temp;
	int sum =funApp(n,count);
	
	if(sum==n)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
		
	}

}
