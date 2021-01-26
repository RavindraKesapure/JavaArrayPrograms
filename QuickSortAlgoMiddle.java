package com.array;

public class QuickSortAlgoMiddle {

	
	int partition(int arr[],int low,int high)
	{
		int pivot= arr[low+high/2];
		
		while(low <= high)
		{
			while(arr[low] < pivot)
			{
				low++;
			}
			while(arr[high] > pivot)
			{
				high--;
			}
			if(low <= high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
		
	void QuickSortRecursion(int[] arr,int low, int high)
	{
		
			int pi = partition(arr, low, high);
			if(low < pi-1)
			{
				QuickSortRecursion(arr,low,pi-1);
			}
			if(pi < high)
			{
				QuickSortRecursion(arr,pi,high);
			}
		
	}
	
	
	void printArray(int arr[])
	{
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args)throws Exception {
 
		int[] arr={15,9,7,13,12,16,4,18,1};
		int len=arr.length;
		
	//	System.out.println(len);
		QuickSortAlgoMiddle qsm=new QuickSortAlgoMiddle();
		qsm.QuickSortRecursion(arr, 0 , len-1);
		qsm.printArray(arr);
	}

}
