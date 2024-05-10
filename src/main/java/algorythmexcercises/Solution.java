package main.java.algorythmexcercises;

import java.util.Arrays;
import java.util.HashSet;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // Implement your solution here
     HashSet<Integer> uniqueNumSet = new HashSet<>();

     Arrays.stream(A)
     .filter(num -> num > 0)
     .forEach(uniqueNumSet::add);

     int smallestNumberMissing = 1;
     while (uniqueNumSet.contains(smallestNumberMissing)) {
         smallestNumberMissing++;
     }
     return smallestNumberMissing;
 }

 public static void main (String args[]) {
     int[] array1 = {1, 3, 6, 4, 1, 2};
     int[] array2 = {1, 2, 3};
     int[] array3 = {-1, -3};

     Solution smallestPositive = new Solution();
     System.out.println(smallestPositive.solution(array1));
     System.out.println(smallestPositive.solution(array2));
     System.out.println(smallestPositive.solution(array3));
 }


}