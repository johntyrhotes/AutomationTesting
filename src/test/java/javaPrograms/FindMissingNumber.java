package javaPrograms;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber 
{

	public static void main(String[] args) {
		
		Integer arr[]= {-2,7,2,3,4,5,1,8,9,10,1,14,13,18,0,3,33,330,44,-1,9};
		
		int small=arr[0];
		int big=arr[0];
	
			for(int i=0;i<arr.length-1;i++)
			{
				if(small>arr[i+1])
				{
					small=arr[i+1];
				}
				
				if(big<arr[i+1])
				{
					big=arr[i+1];
				}
			}
			System.out.println("SmallNumBer ::"+small);
			System.out.println("BigNumBer ::"+big);
			
			Arrays.sort(arr);
			List<Integer> asList = Arrays.asList(arr);
			System.out.println(asList);
			
			System.out.println("Johnty Rhotes");
			
	}
	
}
