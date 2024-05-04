/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.algorythmexcercises;
/**
 *
 * @author Yossijaki
 */
public class DetermineTheSecondLargestNumberOfAnArrayOfIntegers {
    
    static int secondLargest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest number found");
        } else {
            return secondMax;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(numbers)); // Outputs: 4
        
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }
    }
}
