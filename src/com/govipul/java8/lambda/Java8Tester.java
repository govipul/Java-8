package com.govipul.java8.lambda;

interface MathOperation {
	int operation(int x, int y);
}

public class Java8Tester {

	private static final MathOperation ADDITION = (int x, int y) -> x + y;
	private static final MathOperation SUBTRATION = (x, y) -> x - y;
	private static final MathOperation DIVISION = (x, y) -> x / y;

	public static void main(String[] args) {
		System.out.println("10 + 5 = " + operate(10, 5, ADDITION));
		System.out.println("10 - 5 = " + operate(10, 5, SUBTRATION));
		System.out.println("10 / 5 = " + operate(10, 5, DIVISION));
	}

	private static int operate(int x, int y, MathOperation opt) {
		return opt.operation(x, y);
	}

}
