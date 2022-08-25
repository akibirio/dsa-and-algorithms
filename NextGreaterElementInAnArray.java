
/* 
    Given an array, print the Next Greater Element (NGE) for every element. 
The Next greater Element for an element x is the first 
greater element on the right side of x in the array. Elements for which no 
greater element exist, consider the next greater element 
as -1. 

Here you can use two for loops, i=0, and j=i+1, n if decision such that if arr[i] < arr[j]
*/
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class NextGreaterElementInAnArray {
    
    public static void printNGE(int[] arr){
        int arrLen = arr.length;
        
        int next;
        
        for(int i=0; i < arrLen; i++){
            next = -1;
            for(int j=i+1; j< arrLen; j++){
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "--" + next);
        }
        
    }
    
    public static void main(String[] args){
        int[]arr = {11, 13, 21, 3};
        printNGE(arr);
    }
    
}
