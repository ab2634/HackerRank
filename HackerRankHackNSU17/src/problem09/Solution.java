/**
 * 
 */
package problem09;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 18, 2017
 * @project Solution.java Mar 18, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	
    	for (int i = 0; i < T; i++) {
    		int n = scan.nextInt();
    		long output = 2;
    		for (int j = 0; j < n - 1; j++) {
    			output *= 2;
    			output = output % 100000;
    		}
    		
    		output--;
    		
    		System.out.println(output);
    	}
    }
}
/*
1
3
7
15
31

*/