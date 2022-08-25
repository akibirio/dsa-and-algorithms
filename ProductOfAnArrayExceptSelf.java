/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class ProductOfAnArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        //our return value is an array:
        int[] solution = new int[nums.length];
        
        if(nums.length == 0){
            return new int[0];  // empty array
           }
        
        solution[0] = 1;
        for(int i =0; i<nums.length; i++){
            solution[i] = solution[i-1] * nums[i-1];
            
        }
        
        int rightProduct = 1;
        for(int i=nums.length-1; i > 0; i--){
            solution[i] = solution[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return solution;
        
    }
    
}
