/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */


 // Definition for singly-linked list.
  class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class LinkedLinkCycle {
      public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val == Integer.MAX_VALUE)
                return true;
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return false;
        
    }
}
