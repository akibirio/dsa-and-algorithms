/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;
import java.util.*;
/**
 *
 * @author AKIBIRIO
 */

/*
    Given an expression string exp, write a program to examine whether the pairs and 
the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.

*/
public class BalancedBrackets {
    
    // function to check if brackets are balanced
    static boolean checkBalancedBrackets(String expr){
        
        //Deque is faster than Stack Class
        Deque<Character> stack = new ArrayDeque<>();
        // Traversing the Expression and push all opening brackets in the stack
        for(int i=0; i<expr.length(); i++){
            char x = expr.charAt(i);
            
            if(x== '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            
            //if stack is empty at this point, return false
            if(stack.isEmpty()){
                return false;
            }
            
            char check;
            switch(x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == ']'){return false; }
                    break;
                    
                case '}':
                    check = stack.pop();
                    if(check == ')' || check == ']'){return false; }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == ')' || check == '}') {return false; }
                    break;
            }
        }
        
        //check is stack is empty
        return (stack.isEmpty());
    }
    
}
