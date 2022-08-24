/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package africadventures;

import java.util.HashMap;
/**
 *
 * @author Ayub
 */
public class HashMapNums {
    
    public static void main(String[] args){
        int[] nums = {2,8,4,7,3,6};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //put all numbers in the array nums in the map using a for loop
        for (int index = 0; index < nums.length; index++){
            int temp = target - nums[index];
            if(map.containsKey(temp)){
                System.out.println(index);
                System.out.println(map.get(temp) + "," + index);
                System.out.println("test");
            }
            map.put(nums[index], index);
        }
        
       // System.out.println(map);
    }
    
}
