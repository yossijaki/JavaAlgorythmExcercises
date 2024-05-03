package main.java.algorythmexcercises;

import java.util.List;

/**
 *
 * @author Yossijaki
 */
public class ListsProcessor {
    // creating the List of fruits using the convenience factory method (List.of())
    static List<String> allFruits = List.of("Apple", "Berry", "Cherry", "Dekopon", "Elderberry", "Fig", "Grape", "Hazelnut", "Watermelon", "Xoconostle", "Zarzamora");
    
    public static void iterateAndPrintAListOfStringsWithForLoop () {
        for (String fruit : allFruits) {
            System.out.println(fruit);        
        }
    }
    
    public static void iterateAndPrintAListOfStringsWithForEachFromTheIterableInterfaceImplementedOnListClass() {
        allFruits.forEach(fruit -> System.out.println(fruit));
    }
    
    public static void main(String[] arguments) {
        System.out.println("Printing the list of Fruits with for loop:");
        iterateAndPrintAListOfStringsWithForLoop();
        
        System.out.println("Printing the list of Fruits using the forEach method from the Iterable interface that comes implemented by default in the List Class:");
        iterateAndPrintAListOfStringsWithForEachFromTheIterableInterfaceImplementedOnListClass();
    }
}
