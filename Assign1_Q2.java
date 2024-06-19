
public class Assign1_Q2 {
	
	public static int lastOccurrenceOfKey(int arr[], int key) {
		int n = arr.length;
		int lastIndex =-1;
		for(int i=0; i<n; i++) {
			if(arr[i] == key) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = new int [] {1,2,3,1,3,4,1};
          System.out.println("Last occurrenceOfKey : "+lastOccurrenceOfKey(arr,1));
	}

}
