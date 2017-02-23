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
 * @project Solution.java Feb 23, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
public class Solution {

	public static class TriStack {
		
		char[] array;
		boolean[] stackCurly;
		boolean[] stackParen;
		boolean[] stackBrack;
		int pointer;
		
		public TriStack(String sequence) {
			array = new char[1000];
			stackCurly = new boolean[1000];
			stackParen = new boolean[1000];
			stackBrack = new boolean[1000];
			int pointer = 0;
			
			array = sequence.toCharArray();
			
		}
	
		
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // String sequence = "";
        
        TriStack stack = new TriStack(scanner.nextLine());
        
        /*
        for (int i = 0; i < n; i++) {
        	
        }
        */
    }
}
