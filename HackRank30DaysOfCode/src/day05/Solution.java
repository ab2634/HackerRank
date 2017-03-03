/**
 * 
 */
package day05;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 3, 2017
 * @project Solution.java Mar 3, 2017
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
        int n = in.nextInt();
        
        for (int i = 1; i < 11; i++) {
        	System.out.println(n + " x " + i + " = " + (n * i));
        }
        
    }
}