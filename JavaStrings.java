/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class JavaStrings {
    static String string1 = "Java";
    static String string2 = "Programming";
       
    //here we right methods to work on strings
    
    public static void main(String[] args){
    
        //get string length
        int string1Length = string2.length();
        System.out.println("String 2 length is :" + string1Length);
        System.out.println();
        //joint two strings
        String joinedString = string1.concat(string2);
        System.out.println("Concantenated String is :" + joinedString);
    }
    
}
