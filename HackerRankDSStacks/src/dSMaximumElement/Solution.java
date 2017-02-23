/**
 * 
 */
package dSMaximumElement;

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
	
	public static class Stack {
		
		long[] buffer;
		int pointer; 
		long[] max;
		int maxPointer;
		
		public Stack(int size) {
			buffer = new long[size];
			pointer = 0;
			max = new long[size];
			maxPointer = 1;
			max[0] = 0;
			
		}
		
		public void push(int value) {
			buffer[pointer] = value;
			pointer++;
			if (value > max[maxPointer - 1] || value == max[maxPointer - 1]) {
				max[maxPointer] = value;
				maxPointer++;
			}
		}
		
		public long pop() {
			long returnValue = buffer[pointer - 1];
			pointer--;
			if (returnValue == max[maxPointer - 1])
				maxPointer--;
			return returnValue;
		}
		
		public long peep() {
			return buffer[pointer - 1];
		}
	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Stack stack = new Stack(N);
		
		int operation;
		int value;
		for (int i = 0; i < N; i++) {
			operation = scanner.nextInt();
			if (operation == 1) {
				value = scanner.nextInt();
				stack.push(value);
			} else if (operation == 2)
				stack.pop();
			else 
				System.out.println(stack.max[stack.maxPointer - 1]);
		}
	}
}