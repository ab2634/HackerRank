/**
 * 
 */
package problem10;

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
    	String n = scan.next();
    	int k = scan.nextInt();
    	char[] arrayC = n.toCharArray();
    	int[] arrayI = new int[arrayC.length * k];
    	
    	for (int i = 0; i < arrayC.length * k; i++)
    		arrayI[i] = arrayC[i % k] - 48;
    	int sum = 0;
    	while (arrayC.length != 1) {
	    	sum = 0;
	    	for (int i = 0; i < arrayI.length; i++) {
	    		sum += arrayI[i];
	    	}
	    	String str = "";
	    	str += sum;
	    	arrayC = str.toCharArray();
	    	int[] tempArray = new int[arrayC.length];
	    	for (int i = 0; i < arrayC.length; i++)
	    		tempArray[i] = arrayC[i] - 48;
	    	arrayI = tempArray;
	    	
    	}
    	System.out.println(sum);
    	
    }
    
}
