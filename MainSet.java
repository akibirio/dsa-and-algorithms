/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package africadventures;

import java.util.HashSet;

/**
 *
 * @author Ayub
 */
public class MainSet {
    
    static void manipulateSet(HashSet set){
        for(int i=30; i<=40; i++){
            if(set.contains(i)){
                System.out.println("You can not have duplicates");
            }else{
                set.add(i);
            }
        }
        System.out.println("Set : " + set);
    }
    
    public static void main(String[] args){
        HashSet<Integer> set = new  HashSet<>();
        manipulateSet(set);
        
       
    }
}
