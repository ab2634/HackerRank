/**
 * 
 */
package algsSimpleArraySum;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 17, 2017
 * @project Solution.java Mar 17, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int sum = 0;
    	for (int i = 0; i < n; i++)
    		sum += scan.nextInt();
    	
    	System.out.println(sum);
    }
}
