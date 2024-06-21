package com.sunbeam.Assign_5_Q2;

//import com.sunbeam.Assign_5.BSTreeAddNode;

public class SearchKeyMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BSTreeAddNode bst = new BSTreeAddNode();
			
			bst.addNode(8);
			bst.addNode(3);
			bst.addNode(10);
			bst.addNode(6);
			bst.addNode(1);
			bst.addNode(14);
			bst.addNode(13);
			bst.addNode(7);
			bst.addNode(4);
			bst.inorder();
			boolean flag = bst.searchKey(4);
			System.out.println(flag);
		    flag = bst.searchKey(20);
			System.out.println(flag);
	}

}
