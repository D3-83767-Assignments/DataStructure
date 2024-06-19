
public class Assign1_Q7 {
	
	public static int  nonFirstRepeatingElement(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++){
			boolean flag = false;
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j] && i!=j) {
					flag = true;
				}
			}
			if(flag == false) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int index = nonFirstRepeatingElement(arr);
		if(index == -1) {
			System.out.println("non repeating element not fount");
		}
		else {
			System.out.println("non repeating element is  "+ arr[index] +" "+index);
		}
	}

}
