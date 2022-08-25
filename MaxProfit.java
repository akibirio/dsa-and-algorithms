/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
public class MaxProfit {
    
    static int getMaxProfit(int[] prices){
        int maxProfit = 0;
        int minPriceSoFar = prices[0];
        
        //cehck if prices is empty
        if(prices.length < 0){
            return 0;
        }
        
        //loop throught the prices frim index 1;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minPriceSoFar){
                minPriceSoFar = prices[i];
            }
            if (prices[i] - minPriceSoFar > maxProfit){
                maxProfit = prices[i] - minPriceSoFar;
            }
        }
        return maxProfit;   // retruns profit
    }
    
}
