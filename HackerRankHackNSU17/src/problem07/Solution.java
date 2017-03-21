/**
 * 
 */
package problem07;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 18, 2017
 * @project Solution.java Mar 18, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] arrayC = S.toCharArray();
        
        int n = S.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
        	if (arrayC[i] != 'S')
        		count++;
        	if (arrayC[++i] != 'O')
        		count++;
        	if (arrayC[++i] != 'S')
        		count++;
        }
        System.out.println(count);
        
    }
}


