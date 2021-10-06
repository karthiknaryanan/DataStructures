package demo;

public class SubArraySum {

	static int subArraySize = 3;

	static int[] array = { 1, 5, -1, 6, 3, 2 };

	// BruteForce
	public static void subArraySum(int[] arr, int n, int k) {

		for (int i = 0; i <= n - k; i++) {
			int subSumArray = 0;
			for (int j = i; j < i + k; j++) {
				subSumArray += arr[j];
			}
			System.out.println(subSumArray);
		}
	}
	
	// SlidingWindow
		public static void subArraySum(int n, int k,int[] arr) {
			int subSum=0;
			int wStart=0;
			for (int i = 0; i < n; i++) {
				subSum+=arr[i];
				if(i>=k-1) {
					System.out.println(subSum);
					subSum-=arr[wStart];
					wStart++;
				}
			}		
		}

	public static void main(String[] args) {
		subArraySum(array, array.length, 3);
		subArraySum( array.length, 3,array);
	}

}
