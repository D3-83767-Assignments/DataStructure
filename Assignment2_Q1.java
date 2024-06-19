package mypackage;
import java.util.Arrays;

public class Assignment2_Q1 {
	
	public static int insertionSort(int arr[]) {
		int comparison =0;
		int n = arr.length;
		for ( int i =1; i<n; i++) {
			//int comparison = 0;
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp){
				comparison++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return comparison;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2,5,1,3,2,6};
		int count = insertionSort(arr);
		System.out.println(count);
		System.out.println(Arrays.toString(arr));

	}

}
