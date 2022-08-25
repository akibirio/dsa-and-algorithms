
package com.printech.learningproject;

import java.util.ArrayList;

/**
 *
 * @author AKIBIRIO
 */
public class ArrayToBST {
    
    //utility fucntion
    //helper function
    public void utilityFunction(int[] nums, int low, int high, ArrayList<Integer> list){
        int mid;
        if(low<= high){
            mid = low + (high -low)/2;
            list.add(nums[mid]);
            utilityFunction(nums, low, mid-1, list);
            utilityFunction(nums, mid+1, high, list);
            
        }
        
    }
    
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        ArrayList<Integer> list = new ArrayList<>();
        utilityFunction(nums, 0, nums.length-1, list);
        return list.stream().mapToInt(i -> i).toArray();  //convert Arralist to Array using steam API of the 
        // collection module
    }
    
}
