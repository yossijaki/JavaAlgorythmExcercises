package main.java.algorythmexcercises;


import java.util.Stack;

/**
 *
 * @author Yossijaki
 */
public class evaluateReversePolishNotation {
    public int evaluateReversePolishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                }
                default -> stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        evaluateReversePolishNotation solution = new evaluateReversePolishNotation();
        System.out.println(solution.evaluateReversePolishNotation(new String[]{"2","1","+","3","*"})); // Output: 9
        System.out.println(solution.evaluateReversePolishNotation(new String[]{"4","13","5","/","+"})); // Output: 6
        System.out.println(solution.evaluateReversePolishNotation(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // Output: 22
    }
} 
