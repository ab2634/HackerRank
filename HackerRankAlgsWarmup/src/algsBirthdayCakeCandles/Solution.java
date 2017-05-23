/**
 * 
 */
package algsBirthdayCakeCandles;

/**
 * @author BertBaldoni
 * @version 1.0 May 22, 2017
 * @project Solution.java May 22, 2017
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
        int height[] = new int[n];
        for (int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int highest = height[0];
        int numberBlownOut = 1;
        
        for (int i = 1; i < n; i++) {
        	if (height[i] > highest) {
        		highest = height[i];
        		numberBlownOut = 1;
        	} else if (height[i] == highest) {
        		numberBlownOut++;
        	}
        }
        
        System.out.println(numberBlownOut);
    }
}
