/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

/**
 *
 * @author Sanele
 */

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5};
        System.out.println("Origional Array: " + Arrays.toString(originalArray));
        
        reverse(originalArray);
        
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }
    public static void reverse(int[]array){
        int left = 0;
        int right = array.length - 1;
        
        while (left < right){
            //swapping elements
            int temp = array[left];
            array[left]=array[right];
            array[right] = temp;
            
            //moving pointers towards the center
            left++;
            right--;
        }
    }
}
