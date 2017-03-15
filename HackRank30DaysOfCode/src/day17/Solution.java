/**
 * 
 */
package day17;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 15, 2017
 * @project Solution.java Mar 15, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.util.*;
import java.io.*;

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {
	
	public static int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		else if (p == 0)
			return 1;
		else {
			int value = n;
			for (int i = 0; i < p - 1; i++)
				value *= n;
			return value;
		}	
	}
}
