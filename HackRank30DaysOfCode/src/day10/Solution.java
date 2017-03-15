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
		
		char[] charArray2 = binaryString.toCharArray();
		char[] charArray = new char[charArray2.length + 3];
		for (int i = 0; i < charArray2.length; i++) {
			charArray[i] = charArray2[i];
		}
		charArray[charArray2.length] = '0';
		charArray[charArray2.length + 1] = '0';
		
		int max = 1;
		for (int i = 0; i < charArray.length - 1; i++) {
			int current = 1;
			int index = i;
			if (charArray[i] != '0')
				while (checkNext(index, charArray)) {
					current++;
					index++;
					if (current > max)
						max = current;
				}
		}
		System.out.println(max);
		
	}	
	
	public static boolean checkNext(int i, char[] charArray) {
		return (charArray[i] == charArray[i + 1]);
	}
	
}