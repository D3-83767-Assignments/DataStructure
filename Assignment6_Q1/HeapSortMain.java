package com.app.Assignment6;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
			
			Q1minHeap h = new Q1minHeap();
			
			System.out.println("Array before : " + Arrays.toString(arr));
			h.heapSort(arr);
			System.out.println("Array after : " + Arrays.toString(arr));
		

	}

}
