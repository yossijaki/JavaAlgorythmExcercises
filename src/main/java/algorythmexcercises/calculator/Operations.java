package main.java.algorythmexcercises.calculator;

public class Operations {
	
	static final int ADD = 1;
	static final int SUBSTRACT = 2;
	static final int MULTIPLY = 3;
	static final int DIVIDE = 4;

	public static int performIntOperation(String operationName, int firstParam, int secondParam) {
		switch (operationName) {
		case "addition":
			return firstParam + secondParam;
		case "substraction":
			return firstParam - secondParam;
		case "multiplication":
			return firstParam * secondParam;
		default:
			throw new IllegalArgumentException("Invalid operation: " + operationName);
		}
	}
	
	public static double performDoubleOperations(String operationName, double firstParam, double secondParam) {
		switch (operationName) {
		case "division":
			return firstParam / secondParam;
		default:
			throw new IllegalArgumentException("Unexpected value: " + operationName);
		}
	}
}
