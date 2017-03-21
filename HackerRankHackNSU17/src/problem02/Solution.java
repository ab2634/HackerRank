/**
 * 
 */
package problem02;

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
        String s = in.next();
        char[] arrayS;
        arrayS = s.toCharArray();
        int value = 1;
        for (int i = 0; i < s.length(); i++) {
        	if (arrayS[i] < 91)
        		value++;
        }
        System.out.println(value);
    }
}