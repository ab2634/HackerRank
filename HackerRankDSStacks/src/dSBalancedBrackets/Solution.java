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
 * @version 1.0 Feb 23, 2017
 * @project Solution.java Feb 23, 2017 Copyright (c) BertBaldoni 2017 All Rights
 *          Reserved
 *
 */
public class Solution {

	public static class Stack {

		char[] array;
		int a, b, c, d, e, f;

		public Stack(String sequence) {
			array = new char[sequence.length() + 1];
			array = sequence.toCharArray();
			a = 0;
			b = 0;
			c = 0;
			d = 0;
			e = 0;
			f = 0;
		}
		
		public boolean checkIfBalanced() {
			for (int i = 0; i < array.length - 1; i++) {
				char x = array[i];
				char y = array[i + 1];
				if ((x == '{' && y == ')') || (x == '{' && y == ']') || (x == '(' && y == '}') || 
						(x == '(' && y == ']') || (x == '[' && y == ')') || (x == '[' && y == '}'))
					return false;
			}
			return true;
		}
		
		public boolean checkIfEven() {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == '{')
					a++;
				else if (array[i] == '}')
					d++;
				else if (array[i] == '(')
					b++;
				else if (array[i] == ')')
					e++;
				else if (array[i] == '[')
					c++;
				else if (array[i] == ']')
					f++;
				else;
			}
			if (a == d && b == e && c == f)
				return true;
			return false;
		}	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] output = new String[10000];
		int outputCount = 0;
		for (int i = 0; i < n; i++) {
			String sequence = scanner.nextLine();
			Stack stack = new Stack(sequence);
			if (stack.checkIfBalanced() == true && stack.checkIfEven() == true)
				output[i] = "YES";
			else
				output[i] = "NO";
			outputCount++;
		}
		for (int i = 0; i < outputCount; i++) 
			System.out.println(output[i]);
	}
}