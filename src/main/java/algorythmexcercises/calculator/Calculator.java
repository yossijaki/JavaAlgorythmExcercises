package main.java.algorythmexcercises.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter the operation option that you want to execute\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
			int option = scan.nextInt();
			
			switch (option) {
			case Operations.ADD:
				performIntOperations("addition", scan);
				break;
			case Operations.SUBSTRACT:
				performIntOperations("substraction", scan);
				break;
			case Operations.MULTIPLY:
				performIntOperations("multiplication", scan);
				break;
			case Operations.DIVIDE:
				performDoubleOperations("division", scan);
				break;
			default:
				unexpectedOption(option);
			}
		}	finally {
			scan.close();
		}
	}

	private static void unexpectedOption(int option) {
		throw new IllegalArgumentException("The value you've introduced was not expected: " + option);
	}
	
	private static void performIntOperations(String operationName, Scanner scan) {
		System.out.println("--- " + operationName.toUpperCase() + " ---");
		System.out.println("Please enter the first parameter");
		int firstParam = scan.nextInt();
		System.out.println("Now, enter the second parameter");
		int secondParam = scan.nextInt();
		
		int result = Operations.performIntOperation(operationName, firstParam, secondParam);
		System.out.println("the result of your operation is: " + result);
	}
	
	private static void performDoubleOperations(String operationName, Scanner scan) {
		System.out.println("--- " + operationName.toUpperCase() + " ---");
		System.out.println("Please enter the first parameter");
		double firstParam = scan.nextDouble();
		System.out.println("Now, enter the second parameter");
		double secondParam = scan.nextDouble();
		
		double result = Operations.performDoubleOperations(operationName, firstParam, secondParam);
		System.out.println("The result of your operation is: " + result);
	}

}
