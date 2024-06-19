package mypackage;

import java.util.Arrays;

public class Assign2_Q2 {
	public static void descendingLinearSearch(int arr[]){
		int n = arr.length;
		for(int i =1; i<n; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]<temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [] {2,3,1,4,5};
		descendingLinearSearch(arr);
		System.out.println("descending sorted List : "+Arrays.toString(arr));
	}

}
