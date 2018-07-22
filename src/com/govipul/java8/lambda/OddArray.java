package com.govipul.java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class OddArray {

	public static void main(String[] args) {
		Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
		int[] A = { 9, 3, 9, 3, 9, 7 };

		for (int i = 0; i < A.length; i++) {

			if (pair.containsKey(A[i])) {
				int count = pair.get(A[i]);
				pair.put(A[i], ++count);
			} else {
				pair.put(A[i], 1);
			}
		}

		Integer value = pair.entrySet().stream().filter(map -> map.getValue() == 1).map(map -> map.getKey()).findFirst()
				.get();
		System.out.println(value);
	}
}
