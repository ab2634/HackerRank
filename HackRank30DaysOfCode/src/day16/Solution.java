/**
 * 
 */
package day16;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 15, 2017
 * @project Solution.java Mar 15, 2017
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
        
        try {
        	int I = Integer.parseInt(S);
        	System.out.println(I);
        } catch (Exception e) {
        	System.out.println("Bad String");
        }
    }

}
