package com.sunbeam.Assign_5_Q2;

public class BSTreeAddNode {
  static class Node{
	  private int data;
	  private Node left;
	  private Node right;
	  public Node(int value) {
		  data = value;
		  left=right=null;
	  }
  }
  
  private Node root;
  
  public BSTreeAddNode() {
	  root = null;
  }
  public boolean isEmpty() {
	  return root == null;
  }
  public void addNode(int value) {
	  if(isEmpty()) {
		  root = new Node(value);
	  }
	  else {
		  addNode(root,value);
	  }
  }
  public void addNode(Node trav, int value) {
	  if(value < trav.data) {
		  if(trav.left == null) {
			  trav.left = new Node(value);
			  return;
		  }
		  else {
			  addNode(trav.left, value);
		  }
	  }
	  else {
		  if(trav.right == null) {
			  trav.right = new Node(value);
			  return;
		  }
		  else {
			  addNode(trav.right, value);
		  }
	  }
  }
  
  public void inorder() {
	  System.out.println("Inorder : ");
	  inorder(root);
	  System.out.println(" ");
  }
  public void inorder(Node trav) {
	  if(trav == null) {
		  return;
	  }
	  inorder(trav.left);
	  System.out.println(" "+ trav.data);
	  inorder(trav.right);
  }
  
  public boolean searchKey(int data) {
	  return searchKey(root, data);
  }
  public boolean searchKey(Node root, int data) {
	  if(root == null) {
		  return false;
	  }
	  else if(root.data == data) {
		  return true;
	  }
	  else if(root.data < data) {
		  
		  return searchKey(root.right, data);
	  }
	  else {
		  return searchKey(root.left, data);
	  }
  }
}
