package demo;

public class SmallestSubArray {

	/*
	 * Given an array of positive numbers and a positive number 'S', find the length
	 * of the smallest contiguous subarray whose sum is greater than or equal to
	 * 'S'. 
	 * Return 0, if no such subarray exists.
	 */	
	public static void main(String[] args) {
		
		int smallLengthSubarraySum = smallLengthSubarraySum(new int[]{4,1,5,2,4,1}, 6, 7);
		System.out.println(smallLengthSubarraySum);
	}
	
	static int smallLengthSubarraySum(int arr[], int n, int S)
	{
		int i;
	    int wstart = 0, len = Integer.MAX_VALUE;
	    int subSum = 0;

	    for(i = 0; i < n; i++)
	    {
	        subSum += arr[i];

	        while(subSum >= S)
	        {
	            int currentWindowSize = i - wstart + 1;

	            if(currentWindowSize < len)
	                len = currentWindowSize;

	            subSum -= arr[wstart];
	            wstart++;
	        }
	    }

	    return len == Integer.MAX_VALUE? 0 : len;
			
		}
		
		
		
		

}
