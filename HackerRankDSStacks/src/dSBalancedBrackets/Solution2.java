/**
 * 
 */
package dSBalancedBrackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author BertBaldoni
 * @version 1.0 Feb 28, 2017
 * @project Solution2.java Feb 28, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
public class Solution2 {

	public static class Stack {

		private char[] array;
		private char[] stack;
		private int top;
		

		public Stack(String sequence) {
			array = new char[sequence.length() + 1];
			array = sequence.toCharArray();
			stack = new char[sequence.length() + 1];
			top = 0;
			
		}
		
		public boolean checkIfBalanced() {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == '{')
					push(array[i]);
				else if (array[i] == '[')
					push(array[i]);
				else if (array[i] == '(')
					push(array[i]);
				else if (top == 0)
					return false;
				else if (array[i] == '}') {
					if (pop() != '{')
						return false;
				} else if (array[i] == ']') {
					if (pop() != '[')
						return false;
				} else if (array[i] == ')') {
					if (pop() != '(')
						return false;
				}
			}
			
			return (top == 0);
		}
		
		private void push(char c) {
			stack[top] = c;
			top++;
		}
		
		private char pop() {
			top--;
			return stack[top];
		}
	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] output = new String[1000];
		int outputCount = 0;
		for (int i = 0; i < n; i++) {
			String sequence = scanner.nextLine();
			Stack stack = new Stack(sequence);
			if (sequence.length() % 2 == 0){
				if (stack.checkIfBalanced())
					output[i] = "YES";
				else
					output[i] = "NO";
			} else
				output[i] = "NO";
			outputCount++;
			stack = null;
		}
		for (int i = 0; i < outputCount; i++) 
			System.out.println(output[i]);
	}
}