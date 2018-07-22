package com.govipul.java8.lambda;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = { 4, 3, 2, 5, 1, 1 };

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			int leftMax = Arrays.stream(A, 0, i + 1).max().getAsInt();
			int rightMax = Arrays.stream(A, i + 1, A.length).max().getAsInt();
			max = Math.abs(leftMax - rightMax) > max ? Math.abs(leftMax - rightMax) : max;
		}
		System.out.println(max);
	}

}
