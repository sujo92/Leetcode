package com.suziesta;

public class Tree {
    private class TreeNode {
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data){
            this.data= data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    private TreeNode root=null;

    public void insert(int key){
        if(root==null){
            root= new TreeNode(key);
        }else {
            insertRecord(root, key);
        }
    }
    public void get(int value) {
        TreeNode ans=  getNode(root,value);
        if (ans == null) {
            System.out.println("node not found");
        } else {
            System.out.println(ans);
        }
    }

    private TreeNode getNode(TreeNode node, int value) {
        if(node.data == value || node==null){
            return node;
        }
        if(value < node.data){
            if(node.leftChild != null)
                return getNode(node.leftChild,value);
        }
        if(value > node.data){
            if(node.rightChild != null)
                return getNode(node.rightChild,value);
        }
        return null;

    }

    public int min(){
        return getMin(root);
    }

    public int getMin(TreeNode node) {
        if(node.leftChild==null){
            return node.data;
        }else {
            return getMin(node.leftChild);
        }
    }
    public void delete(int key){
        root = delete(root,key);
    }

    private TreeNode delete(TreeNode root, int key) {
        if(root==null)
            return root;

        if(key<root.data){
            root.leftChild= delete(root.leftChild,key);
        }else if(key > root.data){
            root.rightChild= delete(root.rightChild,key);
        }
        //if equal
        else{
            if(root.leftChild==null)
                return root.rightChild;
            else if(root.rightChild==null)
                return root.leftChild;
            //if both child present- look for right syuccessor
            root.data= getMin(root.rightChild);

            root.rightChild= delete(root.rightChild,root.data);
        }
        return root;
    }

    private void insertRecord(TreeNode root, int key) {
        if(root.data==key){
            return;
        }
        else if(key < root.data){
            if(root.leftChild == null){
                root.leftChild= new TreeNode(key);
            }else{
                insertRecord(root.leftChild,key);
            }
        }
        else{
            if(root.rightChild == null){
                root.rightChild= new TreeNode(key);
            }else{
                insertRecord(root.rightChild,key);
            }
        }

    }

    public void printTree() {
        printInorder(root);
    }

    private void printInorder(TreeNode node) {
        if(node==null)
            return;

        printInorder(node.leftChild);
        System.out.println(node.data);
        printInorder(node.rightChild);
    }
}
