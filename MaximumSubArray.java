/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        
        int tempSum = nums[0];
        int maxSum = nums[0];
        
        for(int i=1; i < nums.length; i++){
            tempSum = Math.max(tempSum+nums[i], nums[i]);
            maxSum = Math.max(tempSum, maxSum);
        }
        
        return maxSum;
    }
    
}
