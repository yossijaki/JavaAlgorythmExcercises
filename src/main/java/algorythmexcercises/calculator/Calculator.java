package main.java.algorythmexcercises.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the operation option that you want to execute\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
		int option = scan.nextInt();
		
		switch (option) {
		case 1: {
			System.out.println("--- ADDITION ---\nPlease enter the first parameter to add");
			int firstParam = scan.nextInt();
			System.out.println("Now, enter the second parameter");
			int secondParam = scan.nextInt();
			int addition = new Operations().addition(firstParam, secondParam);
			System.out.println("The result of you sum is: " + addition);
			break;
		} case 2: {
			System.out.println("--- SUBSTRACTION ---\nPlease enter the first parameter to substract");
			int firstParam = scan.nextInt();
			System.out.println("Now, enter the second parameter");
			int secondParam = scan.nextInt();
			int substraction = new Operations().substraction(firstParam, secondParam);
			System.out.println("The result of your substraction is: " + substraction );
			break;
		} case 3: {
			System.out.println("--- MULTIPLICATION ---\nPlease enter the first parameter to multiplicate");
			int firstParam = scan.nextInt();
			System.out.println("Now, enter the second parameter");
			int secondParam = scan.nextInt();
			int multiplication = new Operations().multiplication(firstParam, secondParam);
			System.out.println("The result of your multiplication is: " + multiplication);
			break;
		} case 4: {
			System.out.println("--- DIVISION ---\nPlease enter the first parameter to divide");
			double firstParam = scan.nextInt();
			System.out.println("Now, enter the second parameter");
			double secondParam = scan.nextInt();
			double division = new Operations().division(firstParam, secondParam);
			System.out.println("The result of you division is: " + division);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
		
	}

}
