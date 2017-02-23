/**
 * 
 */
package dSArrays;

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
		int[] A;
		Scanner scanner = new Scanner(System.in);
		int N =  -1;
		while (N < 1 || N > 1000) {
			N = scanner.nextInt();
		}
		// System.out.println(N);
		
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		
		for (int i = N - 1; i >= 0; i--)
			System.out.print(A[i] + " ");
		
	}
	
}
