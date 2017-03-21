/**
 * 
 */
package problem08;

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
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        	array.add(in.nextInt());
        int minValue = 100000000;
        
        Collections.sort(array);
        
        for (int i = 0; i < n - 1; i++) {
        	int temp = array.get(i) - array.get(i + 1);
        	if (temp < 0)
        		temp = temp * -1;
        	if (temp < minValue)
        		minValue = temp;
        }
        
        
        System.out.println(minValue);
    }
}

