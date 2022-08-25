/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class ReverseString {
    public static void main(String[] args){
    
        String str = "ayubgakuru";
        
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.printf("Actual Word: %s, Word after reversin is %s", str, reversed);
    }
    
    
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }
        
        String reverse="";
        
        for(int i=source.length()-1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
        
        return reverse;
    }
}
