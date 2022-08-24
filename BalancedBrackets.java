/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package africadventures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Ayub
 */
public class BalancedBrackets {
    // new static function
    public static boolean checkBalancedBrackets(String expr){
        Deque<Character> stack = new ArrayDeque<>();
        
        // for loop to loop through the length of the string/ then have a new variabe to track our charAt(i)
        for(int i=0; i < expr.length(); i++){
            char c = expr.charAt(i);
            
            // conditional check of brackets and add them into the stack
            if(c == '(' || c == '{' || c == ']'){
                stack.push(c);
                continue;
            }
            
            //check is stackis empty return false:
            if(stack.isEmpty()){
                return false;
            }            
            // new variable to check the poped char from the stack, compare wth counterpart:
            char check;
            switch(c){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{'){
                        return false;
                    }
                    break;
        }            
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args){
        if(checkBalancedBrackets("{{")){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
    
}
