/**
 * 
 */
package day09;

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
		System.out.println(factorial(value));
	}
	
	public static int factorial(int value) {
		if (value > 0)
			return value * factorial(value - 1);
		else 
			return 1;
	}
	
}
