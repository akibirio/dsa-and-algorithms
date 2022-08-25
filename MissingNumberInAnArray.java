
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */

/*
    Given an array of size N-1 such that it only contains distinct integers in the 
    range of 1 to N. Find the missing element.
*/
public class MissingNumberInAnArray {
    
    public static int missingNumber(int[] array){
        
        //get sum of elements in the array:
        int totalSum = 0;
        for(int i=0; i<array.length-1; i++){
            totalSum += array[i];
        }
        
        int summation = getSummation(array.length);
        int difference = summation - totalSum;
        
        return difference;
    }
    
    public static int getSummation(int n){
    
        return (n*(n+1))/2;
    }
    
    //driver code
    
    public static void main(String[] args){
    
        int[] array = {1,2,3,5};
       int missingNumber =  missingNumber(array);
       System.out.println(missingNumber);
        
    }
}
