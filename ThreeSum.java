/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author AKIBIRIO
 */
public class ThreeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        LinkedList<List<Integer>> result = new LinkedList<>();
        
        for(int i=0; i < nums.length; i++){
            int target = 0 - nums[i];
            //pointers:
            int left = i+1;
            int right = nums.length - 1;
            
            while(left < right){
                if(nums[left] + nums[right] == target){
                    ArrayList<Integer> innerSol = new ArrayList<>();
                    innerSol.add(nums[i]);
                    innerSol.add(nums[left]);
                    innerSol.add(nums[right]);
                    result.add(innerSol);
                    
                    //move pointers:
                    while(left < right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(nums[left]+nums[right] > target){
                    right--;
                }else{
                    left++;
                }
            }
            while(i < nums.length-2 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return result;
        
    }
    
}
