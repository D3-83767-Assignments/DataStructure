import java.util.Arrays;

public class Assign1_Q9 {
	
	public static int selectionSort(int arr[]) {
		int n = arr.length;
		int comparison=0;
		for(int i =0; i< n-1; i++) {
			for(int j =i+1; j<n; j++) {
				comparison++;
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return comparison;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {2,3,1,4,5};
		int comparison = selectionSort(arr);
		System.out.println("no. of comparisons :"+ comparison);
		System.out.println(Arrays.toString(arr));
	}
}
