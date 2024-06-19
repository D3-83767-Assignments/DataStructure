
public class Assign1_Q3 {
	
	public static int linearSearchComparisons(int arr[], int key) {
		int comparisons = 0;
		for(int i =0; i<arr.length; i++) {
			comparisons++;
			if(arr[i]==key) {
				System.out.println("linear search comparisons : "+comparisons);
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearchComparison(int arr[], int key) {
		int comparisons = 0;
		int left = 0, right = arr.length -1;
		System.out.println("Inside binarySearch");
		
		while(left <= right) {
			comparisons++;
			int mid = left + (right - left)/2;
			if(arr[mid] == key) {
				System.out.println("No. of comparisons "+ comparisons);
				return comparisons;
			}
			else if(key < arr[mid]){
				right = mid-1;
			}
			else {
				left = mid + 1;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= new int[] {1,2,3,4,5,6,7};
        int comp = linearSearchComparisons(arr, 5);
        System.out.println("Binary Search Comparisons : "+binarySearchComparison(arr, 5));
	}

}
