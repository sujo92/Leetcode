package com.suziesta;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(15);
        tree.insert(10);
        tree.insert(25);
        tree.insert(5);
        tree.insert(11);
        tree.insert(1);
        tree.get(155);
       System.out.println("min: "+tree.min());
        System.out.println("before delete: ");
        tree.printTree();
        tree.delete(100);
        System.out.println("After delete: ");
        tree.printTree();
    }

}
