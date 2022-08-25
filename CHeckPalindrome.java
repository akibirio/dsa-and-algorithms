/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class CHeckPalindrome {
    
    static boolean checkPalindrome(String str){
        int i=0;
        int j= str.length()-1;
        String newToLowerString = str.toLowerCase();
        
        while(i < j){
            if(newToLowerString.charAt(i) != newToLowerString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
