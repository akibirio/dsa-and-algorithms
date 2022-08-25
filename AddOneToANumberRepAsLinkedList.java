
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */

/*

A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Your task is to complete the function addOne() which takes the head of the linked list as the only argument and 
returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.
*/

class Node{
    int data;
    Node next;
    
    public Node(int x){
        data = x;
        next = null;
    }
} 

public class AddOneToANumberRepAsLinkedList {
    
    //helper function
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
    
    
    //addOne function
    public static Node addOne(Node head){
        
        head = reverse(head);
        Node curr = head;
        int carry = 0;
        int n = curr.data + 1;
        if (n > 9){
            carry = n/10;
            curr.data = n%10;
            Node prev = curr;
            curr = curr.next;
            
            
            //while loop;
            while(curr != null){
                int tmp = curr.data + carry;
                curr.data = tmp%10;
                prev = curr;
                curr = curr.next;
            }
            
            if(carry!=0){
                prev.next = new Node(carry);
            }
        }else{
            curr.data = n;
        }
        return reverse(head);
    
    }
    
    
    
}
