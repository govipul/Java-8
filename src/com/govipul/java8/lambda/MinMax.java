package com.govipul.java8.lambda;

import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		int[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625 };

		long total = Arrays.stream(arr).mapToLong(n -> Long.valueOf(n)).sum();
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

		for (int val : arr) {
			long data = total - val;

			if (data < min) {
				min = data;
			}

			if (data > max) {
				max = data;
			}
		}

		System.out.println(min + " " + max);
	}
}
