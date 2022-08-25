/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author AKIBIRIO
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
        
            HashMap<Integer, Integer> map  = new HashMap<>();
            
            for(int i = 0; i < nums.length; i++){
                int temp = target - nums[i];
                
                if(map.containsKey(temp)){
                    return new int[] {map.get(temp), i};
                }
                
                map.put(nums[i], i);
            }
            
            return new int[0];
    }
        
     public static void main(String[] args){
     TwoSum object = new TwoSum();
     int[] nums = {2,7,11,15};
     int target = 9;
    System.out.println(Arrays.toString(object.twoSum(nums, target)));
     
     }
    
}
