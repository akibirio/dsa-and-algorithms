
package com.printech.learningproject;

import java.util.ArrayList;

/**
 *
 * @author AKIBIRIO
 */

/*
Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach 
when you always travel preferring the left subtree over the right subtree. 
Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
Reverse right boundary nodes: defined as the path from the right-most node to the root.
The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the 
left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 
*/
class Node{
    int data;
    Node left, right;
    
    public Node(int d){
        data = d;
        left = right = null;
    }
}


public class BoundaryTraversalOfBinaryTree {
    
    public Node lastNode;
    ArrayList<Integer> boundary(Node node){
        lastNode = null;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(node.data);
        lastNode=node;
        leftBoundary(node.left, ans);
        leafNodes(node, ans);
        rightBoundary(node.right, ans);
        
        return ans;
    }
    
    //left boundary
    public void leftBoundary(Node node, ArrayList<Integer> ans){
        if(node == null) return;
        lastNode = node;
        ans.add(node.data);
        if(node.left==null) leftBoundary(node.right, ans);
        leftBoundary(node.left, ans);
    }
    
    //leaf Nodes
    public void leafNodes(Node node,ArrayList<Integer> ans){
	    if(node==null) return;
	    if(node.left==null && node.right==null && node!=lastNode){
	        ans.add(node.data);
	        lastNode=node;
	    }
	    leafNodes(node.left,ans);
	    leafNodes(node.right,ans);
	}
    
    	public void rightBoundary(Node node,ArrayList<Integer> ans){
	    if(node==null) return;
	    if(node.right==null) rightBoundary(node.left,ans);
	    rightBoundary(node.right,ans);
	    if(node!=lastNode){
	        ans.add(node.data);
	    }
}}
