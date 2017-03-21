/**
 * 
 */
package problem03;

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
    	int n = scan.nextInt();
    	
    	String[] arrayS = new String[n];

    	for (int i = 0; i < n; i++) {
    		arrayS[i] = "";
    		if (i < (n - 1)) {
    			for (int j = 0; j < n - i - 1; j++)
    				arrayS[i] += " ";
    			for (int j = 0; j < i + 1; j++)
    				arrayS[i] += "#";
    		}
    		else
    			for (int j = 0; j < n; j++)
    				arrayS[i] += "#";
    				
    	}
    	
    	for (int i = 0; i < n; i++)
    		System.out.println(arrayS[i]);
     }
}