/**
 * 
 */
package dSAlgorithmicCrush;

import java.io.*;
import java.util.*;

/**
 * @author BertBaldoni
 * @version 1.0 Feb 22, 2017
 * @project Solution.java Feb 22, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] list = new long[N + 1];
		
		int M = scanner.nextInt();
		
		for (int i = 0; i < M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			long k = scanner.nextLong();
			list[a - 1] += k;
			list[b] -= k;
		}
		
		long sum = 0;
		long max = 0;
		for (int i = 0; i < N; i++) {
			sum += list[i];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
}