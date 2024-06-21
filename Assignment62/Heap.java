package com.app.Assignment62;

//import java.util.Arrays;

public class Heap {

	int Size;
	int arr[];
     public Heap(int size){
    	 Size=0;
    	 arr = new int[size + 1];
     }
     public void addHeap(int value) {
    	 Size++;
    	 arr[Size]=value;
    	 int ci=Size;
    	 int pi=ci/2;
     
     while(pi >= 1){
    	 if(arr[pi] < arr[ci]) {
    		 break;
    	 }
    	 int temp = arr[ci];
    	 arr[ci] = arr[pi];
    	 arr[pi] = temp;
    	 
    	 ci = pi;
    	 pi = ci/2;
     }
     
 }
  
 public int deleteHeap() {
	 int min = arr[1];
	 arr[1] = arr[Size];
	 arr[Size]=min;
	 Size--;
	 int pi =1;
	 int ci = pi * 2;
	 
	 while(ci <= Size){
		 if((ci + 1)<= Size  && arr[ci + 1]<arr[ci]) {
			 ci = ci + 1;
		 }
		 if(arr[pi]<arr[ci]) {
			 break;
		 }
		 int temp2 = arr[ci];
		 arr[ci] = arr[pi];
		 arr[pi] = temp2;
		 pi = ci;
		 ci = pi * 2;
	 }
	 return min;
	 
 }
 
 public boolean isEmpty() {
		return Size == 0;
	}
	
	public boolean isFull() {
		return Size == arr.length-1;
	}
	
	public int getMax() {
		return arr[1];
	}

 


}
