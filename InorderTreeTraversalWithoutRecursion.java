
package com.printech.learningproject;

import java.util.Stack;

/**
 *
 * @author AKIBIRIO
 */

//make tree Nodes class
class Node{
    int data;
    Node left, right;
    
    public Node(int item){
        data = item;
        left = right = null;
    }
}


public class InorderTreeTraversalWithoutRecursion {
    
    Node root;
    public void inOrderTraversal(){
        
        if(root == null){
            return;
        }
        
        Stack<Node> stck = new Stack<>();
        Node current = root;
        
        //traverse the tree
        while(current != null || !stck.isEmpty()){
            
            //reach the left most node of the current node
            while(current != null){
                //place pointer to a tree node on stack, before traversing further
                stck.push(current);
                current = current.left;
            }
            
            //current must be null at this point
            current = stck.pop();
            System.out.print(current.data + " ");
            
            //we have visited the Node and its left subtree, now its right subtree
            current = current.right;            
        }
        
        
    }
    
    public static void main(String args[])
    {
 
        /* creating a binary tree and entering
        the nodes */
        InorderTreeTraversalWithoutRecursion tree = new InorderTreeTraversalWithoutRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inOrderTraversal();
    }
    
}
