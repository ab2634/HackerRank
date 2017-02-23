/**
 * 
 */
package dSSparseArrays;

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
		String[] array = new String[N];
		scanner.nextLine();
		for (int i = 0; i < N; i++)
			array[i] = scanner.nextLine();
		
		int Q = scanner.nextInt();
		int count;
		String comparison;
		scanner.nextLine();
		
		for (int i = 0; i < Q; i++) {
			count = 0;
			comparison = scanner.nextLine();
			for (int j = 0; j < N; j++) {
				if (array[j].equals(comparison))
					count++;
				
			}
			System.out.println(count);
		}	
	}
}