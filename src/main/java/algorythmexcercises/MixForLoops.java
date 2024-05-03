/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.algorythmexcercises;

import java.util.List;

/**
 *
 * @author Yossijaki
 */
public class MixForLoops {
    public static void main (String [] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";
        
        for (int i = 1; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }
        
        for (Integer num : nums)
            output += nums + " ";
        /*"
        for (int i = 0; i <= nums.length; i++) {
            output += nums.get(i) + " ";
        }
        */
        for (int i = 0; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }
        
        System.out.println(output);
    }
}
