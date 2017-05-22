/**
 * 
 */
package algsPlusMinus;

/**
 * @author BertBaldoni
 * @version 1.0 May 22, 2017
 * @project Solution.java May 22, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int plus = 0, minus = 0, zero = 0;
		for (int i = 0; i < n; i++) {
			int next = scan.nextInt();
			if (next > 0) {
				plus++;
			} else if (next < 0) 
				minus++;
			else
				zero++;
		}
		System.out.println((double)(plus * 1.0 / n));
		System.out.println((double)(minus * 1.0 / n));
		System.out.println((double)(zero * 1.0 / n));

	}
}