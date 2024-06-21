package com.app.Assignment6;

import java.util.Arrays;

public class Q1minHeap {
	int Size;
	int arr[];
     public void Q1Heap(int size){
    	 Size=0;
    	 arr = new int[size + 1];
     }
     public void addHeap(int arr[]) {
    	 Size++;
    	 //arr[Size]=value;
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
  
 public int deleteHeap(int arr[]) {
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
 
 public void heapSort(int arr[]) {
		//1. create heap
		for(int i = 1 ; i < arr.length ; i++) {
			addHeap(arr);
		//2. delete heap
		}
		System.out.println("Array after addHeap : " + Arrays.toString(arr));
		for(int i = 1 ; i < arr.length ; i++) {
			deleteHeap(arr);
		}
		for(int i = arr.length - 1; i>0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("Array after deleteHeap : " + Arrays.toString(arr));
	}

}

