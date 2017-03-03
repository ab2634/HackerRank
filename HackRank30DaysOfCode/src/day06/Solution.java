/**
 * 
 */
package day06;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 3, 2017
 * @project Solution.java Mar 3, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	scan.nextLine();
    	String input;
    	
    	for (int i = 0; i < T; i++) {
    		input = scan.nextLine();
    		char[] array = new char[input.length()];
    		array = input.toCharArray();
    		for (int e = 0; e < array.length; e = e + 2)
    			System.out.print(array[e]);
    		System.out.print(" ");
    		for (int o = 1; o < array.length; o = o + 2)
    			System.out.print(array[o]);
    		System.out.println();
    	}
    }
}