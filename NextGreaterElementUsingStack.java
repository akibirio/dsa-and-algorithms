
package com.printech.learningproject;

import java.util.Stack;

/**
 *
 * @author AKIBIRIO
 */


/*
Push the first element to stack.
Pick rest of the elements one by one and follow the following steps in loop. 
   - Mark the current element as next.
   - If stack is not empty, compare top element of stack with next.
   - If next is greater than the top element, Pop element from stack. next is
    the next greater element for the popped element.
   - Keep popping from the stack while the popped element is smaller than next.
    next becomes the next greater element for all such popped elements.
Finally, push the next in the stack.
After the loop in step 2 is over, pop all the elements from the stack and print
-1 as the next element for them.    

*/

public class NextGreaterElementUsingStack {
    static int arr[] = { 11, 13, 21, 3 };
    
    public static void printNGE(){
        
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        
        // loop through in reverse
        for(int i = arr.length -1; i >= 0; i--){
        
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();                    
                }
            }
            nge[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);            
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + "-->" + nge[i]);
        }
        
        
    }
    
    public static void main(String[] args){
        printNGE();
        }
    
}
