
public class Assign1_Q6 {
	public static int countLinearSearch(int arr[], int n, int key){
		int count=0;
		for(int i =0; i<arr.length-1; i++) {
			
			if(arr[i]== key ) {
				count++;
			}
			if(count == n) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int []{2,1,4,5,1,3,1};
		int occurence = countLinearSearch(arr,2,1);
		System.out.println(occurence);

	}

}
