package com.array;

// WAP Duplicate Value using HashMap
import java.util.*;
import java.util.Map.Entry;
public class HashMapDublicateNum {

	public static void main(String[] args) {

     int arr[]= {3,4,5,3,2,1,4,6,3,4};
     
     Map<Integer,Integer> hm=new HashMap<>();
     for(int no: arr)
     {
    	 
    	 Integer count= hm.get(no);
    	 if(count==null)
    	 {
    		 hm.put(no, 1);
    	 }
    	 else
    	 {
    		 count=count+1;
    		 hm.put(no,count);
    	 }
      }
     
     System.out.println("Dublicate Element is ");
       Set<Entry<Integer, Integer>> es=hm.entrySet();
       for(Entry<Integer, Integer> me: es)
       {
    	   if(me.getValue()>1)
    	   {
    		   System.out.println(me.getKey());
    	   }
       }
	}

}
