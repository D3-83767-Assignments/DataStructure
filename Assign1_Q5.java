
public class Assign1_Q5 {
	
	public static int binarySearch(int arr[], int key){
		int left = 0, right = arr.length - 1;
		while(left <= right) {
			int mid = left + (right - left)/2 ;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key < arr[mid]){
				left= mid +1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {9,6,4,2,1};
           int index = binarySearch(arr, 6);
           System.out.println("Element found at index : " + index);
	}

}
