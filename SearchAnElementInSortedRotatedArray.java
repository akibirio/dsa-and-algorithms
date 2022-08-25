/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.printech.learningproject;

/**
 *
 * @author AKIBIRIO
 */
/*

1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4) Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] 
*/
public class SearchAnElementInSortedRotatedArray {
    
    //returns the index of key in arr[low...high]
    //if the key exists, otherwise return -1
    static int search(int[]arr, int low, int high, int key){
        
        if(low > high){
            return -1;
        }
        
        int mid = (high+low)/2;
        
        if(arr[mid] == key){
            return mid;
        }
        
        //if first subarray is sorted, l, arr[mid]
        if(arr[low] <= arr[mid]){
            //check if the key lies in half, or the other half
              if(key >= arr[low] && key <= arr[mid]){
                  return search(arr, low, mid-1, key);
              }
              
              /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
              
              return search(arr, mid+1, high, key);
        }
        
        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/
        
        if(key >= arr[mid] && key <= high){
            return search(arr, mid+1, high, key);
        }
        return search(arr, low, mid-1, key);
    }
    
}
