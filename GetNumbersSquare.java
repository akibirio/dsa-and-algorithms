/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class GetNumbersSquare {
     
    private static int getSquare(int number){
    
        return number * number;
    }
    
    public static void main(String[] args){
        
        // the advatange of using functions/methods is code re-usability see how the method is called N times.
        for (int times=0; times<10; times++){
            int result = getSquare(times);
            System.out.println("The Square of " + times + " is: " + result);
        }
            
    }
    
}
