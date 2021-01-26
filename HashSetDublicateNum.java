package com.array;

//WAP Duplicate Element using HashSet 
import java.util.*;
public class HashSetDublicateNum {

	public static void main(String[] args) {

		int arr[]={1,2,4,6,8,2,3,4,5,4};
		Set<Integer> s=new HashSet<>();
		
		System.out.println("Dublicate Element is ");
		for(int a: arr)
		{
			boolean b=s.add(a);
			if(b==false)
			{
				System.out.println(a);
			}
		}
	}

}
