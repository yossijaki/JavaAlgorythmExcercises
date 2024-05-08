package main.java.concepts.functionalinterfaces;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.BiConsumer;

import java.util.function.IntPredicate;
import java.util.function.DoublePredicate;
import java.util.function.LongPredicate;
import java.util.function.BiPredicate;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.DoubleFunction;
import java.util.function.BiFunction;



public class FunctionalTypes {
	public static void main(String args[]) {
		// CONSUMER
		// IntConsumer example
        IntConsumer intConsumer = value -> System.out.println("IntConsumer Value: " + value);
        intConsumer.accept(10);

        // LongConsumer example
        LongConsumer longConsumer = value -> System.out.println("LongConsumer Value: " + value);
        longConsumer.accept(100L);

        // DoubleConsumer example
        DoubleConsumer doubleConsumer = value -> System.out.println("DoubleConsumer Value: " + value);
        doubleConsumer.accept(10.5);
        
        // BiConsumer that adds two Integers and prints the result
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);  // Outputs: 3
        
        
        
        // PREDICATE
        //IntPredicate
        IntPredicate isOdd = argument -> argument % 2 == 1;
        System.out.println(isOdd.test(9));  // Outputs: true
        System.out.println(isOdd.test(10)); // Outputs: false
        
        // DoublePredicate
        DoublePredicate dp = (d) -> d > 0;
        System.out.println(dp.test(0.5));  // Outputs: true
        
        // LongPredicate
        LongPredicate i = (l) -> l > 0;
        System.out.println(i.test(Long.MAX_VALUE));  // Outputs: true
        
        // BiPredicate
        BiPredicate<Integer, String> biPredicate = (n, s) -> n == Integer.parseInt(s);
        System.out.println(biPredicate.test(2, "2"));  // Outputs: true
        
        
        
        // FUNCTION
        // IntFunction
        IntFunction<Double> ob = a -> a / 2.0;
        System.out.println(ob.apply(3));  // Outputs: 1.5
        
        // LongFunction
        LongFunction<String> longToString = l -> Long.toString(l);
        String result = longToString.apply(123L);
        System.out.println(result);  // Outputs: "123"
        
        // DoubleFunction
        DoubleFunction<String> df = (d) -> d + " is now a string";
        System.out.println(df.apply(0.5));  // Outputs: "0.5 is now a string"
        
        // BiFunction
        // takes two Integers and return a Double
        BiFunction<Integer, Integer, Double> power = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = power.apply(2, 4);
        System.out.println(result2);  // Outputs: 16.0
	}

}
