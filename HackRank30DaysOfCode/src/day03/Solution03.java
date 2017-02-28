/**
 * 
 */
package day03;

/**
 * @author BertBaldoni
 * @version 1.0 Feb 28, 2017
 * @project Solution03.java Feb 28, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1)
			ans = "Weird";
		else if (n % 2 == 0 && n >= 2 && n <= 5)
			ans = "Not Weird";
		else if (n % 2 == 0 && n >= 6 && n <= 20)
			ans = "Weird";
		else
			ans = "Not Weird";

		System.out.println(ans);
	}
}
