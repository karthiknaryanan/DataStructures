package demo;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		int[] num = {2,85,45,89,14};
		int temp =0;
		for(int i = 0; i<num.length;i++) {
			for(int j =i+1; j<num.length;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i]= num[j];
					num[j]= temp;
				}
			}
		}
 for (int i : num) {
	System.out.println(i);
}
	}

}
