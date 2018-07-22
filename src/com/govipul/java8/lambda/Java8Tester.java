package com.govipul.java8.lambda;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

interface MathOperation {
	int operation(int x, int y);
}

public class Java8Tester {

	private static final MathOperation ADDITION = (int x, int y) -> x + y;
	private static final MathOperation SUBTRATION = (x, y) -> x - y;
	private static final MathOperation DIVISION = (x, y) -> x / y;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("10 + 5 = " + operate(10, 5, ADDITION));
		System.out.println("10 - 5 = " + operate(10, 5, SUBTRATION));
		System.out.println("10 / 5 = " + operate(10, 5, DIVISION));

		int[] A = { 1, 3, 6, 4, 1, 2, -1 };

		int x = 0;
		Set<Integer> collect = Arrays.stream(A).filter(num -> num > 0).boxed().collect(Collectors.toSet());

		collect.forEach(System.out::println);

	}

	private static int operate(int x, int y, MathOperation opt) {
		return opt.operation(x, y);
	}

}
