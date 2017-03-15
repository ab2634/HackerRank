/**
 * 
 */
package day10;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 15, 2017
 * @project Solution.java Mar 15, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		String binaryString = Integer.toBinaryString(value);
		char[] charArray = binaryString.toCharArray();
		
		int max = 1;
		for (int i = 0; i < charArray.length; i++) {
			
		}
		System.out.println(max);
		
	}	
}
