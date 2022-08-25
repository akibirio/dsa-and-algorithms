
package com.printech.learningproject;

import java.util.HashMap;

/**
 *
 * @author AKIBIRIO
 */
public class FindWordCountinString {
    // using an Array and HashMap
    public static void main(String[] args){
        String str = "Hello World, This is Ayub Gakuru, is, Ayub ";
        
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            if(map.containsKey(words[i])){
                int count = map.get(words[i]);
                map.put(words[i], count+1);
            }else{
                map.put(words[i], 1);
            }
        }
        
        System.out.println(map);
        
    }
    
}
