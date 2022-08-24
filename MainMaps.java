/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package africadventures;

import java.util.HashMap;

/**
 *
 * @author Ayub
 */
public class MainMaps {
    
   public static void main(String[] args){
       
       HashMap<String,Double> map = new HashMap<>();
       map.put("Ayub", 3.35);
       map.put("John", 2.73);
       map.put("Alex", 3.0);
       
       map.keySet().stream().forEach((name) -> {
           if (name.equals("Ayub")){
               map.replace(name, 3.9);
           }
       });
       System.out.println(map.get("Ayub"));
       
      
   }
    
}
