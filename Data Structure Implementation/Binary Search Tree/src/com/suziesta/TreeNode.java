//package com.suziesta;
//
//public class TreeNode {
//    private int data;
//    private TreeNode leftChild;
//    private TreeNode rightChild;
//
//    public TreeNode(int data) {
//        this.data = data;
//    }
//
//    public TreeNode insertRecord(TreeNode root, int key) {
//        if(key < root.data){
//            if(root.leftChild == null){
//                root.leftChild= new TreeNode(key);
//            }else{
//                insertRecord(root.leftChild,key);
//            }
//        }
//        else{
//            if(root.rightChild == null){
//                root.rightChild= new TreeNode(key);
//            }else{
//                insertRecord(root.rightChild,key);
//            }
//        }
//        return root;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public TreeNode getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(TreeNode leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public TreeNode getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(TreeNode rightChild) {
//        this.rightChild = rightChild;
//    }
//}
