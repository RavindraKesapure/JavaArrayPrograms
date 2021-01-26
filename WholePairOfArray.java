package com.array;

public class WholePairOfArray {

	public void findPair(int arr[],int sum)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("[ "+arr[i]+" , " +arr[j]+" ]");
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int arr[]= {1,3,2,5,4,6,7,8,9};
		int sum=11;
		
		WholePairOfArray wp=new WholePairOfArray();
		wp.findPair(arr,sum);
	}

}
