/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author AKIBIRIO
 */
public class RemoveDuplicatesArrayList {
    
    public static void main(String[] args){
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println("The List of Numbers<>Elements: " + list);
        
        Set<Integer> primeWithoutDuplicates = new LinkedHashSet<>(list);
        list.clear();  // removing all items from the list
        list.addAll(primeWithoutDuplicates);
        System.out.println("List of Original Numbers without duplication :" + list);
        
    }
    
}
