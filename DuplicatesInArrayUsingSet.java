/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

import java.util.HashSet;

/**
 *
 * @author AKIBIRIO
 */
public class DuplicatesInArrayUsingSet {
    
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            
            set.add(nums[i]);
        }
        return false;
    }
    
}
