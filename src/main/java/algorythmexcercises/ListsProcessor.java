package main.java.algorythmexcercises;

import java.util.List;

/**
 *
 * @author Yossijaki
 */
public class ListsProcessor {
    // creating the List of fruits using the convenience factory method (List.of())
    static List<String> allFruits = List.of("Apple", "Berry", "Cherry", "Dekopon", "Elderberry", "Fig", "Grape", "Hazelnut", "Watermelon", "Xoconostle", "Zarzamora");
    
    // Iterate the list of fruits manually creating a for loop and going through the List
    public static void iterateAndPrintAListOfStringsWithForLoop () {
        for (String fruit : allFruits) {
            System.out.println(fruit);        
        }
        System.out.println("\n");
    }
    
    
    //Iterate the list of fruits using forEach from the "Iterable" interface that's already implemented on the List class by default
    public static void iterateAndPrintAListOfStringsWithForEach() {
        allFruits.forEach(fruit -> System.out.println(fruit));
    }
    
    
    
    
    
    public static void main(String[] arguments) {
        System.out.println("Printing the list of Fruits with for loop:");
        iterateAndPrintAListOfStringsWithForLoop();
        
        System.out.println("Printing the list of Fruits using the forEach method from the Iterable interface that comes implemented by default in the List Class:");
        iterateAndPrintAListOfStringsWithForEach();
    }
}
