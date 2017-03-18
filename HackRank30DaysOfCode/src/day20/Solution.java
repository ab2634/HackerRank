/**
 * 
 */
package day20;

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
    	int[] array = new int[n];
    	
    	for (int i = 0; i < n; i++)
    		array[i] = scan.nextInt();
    	
    	int numberOfSwaps = sort(array);
    	
    	System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
    	System.out.println("First Element: " + array[0]);
    	System.out.println("Last Element: " + array[array.length - 1]);
    	
    	
    	
    }
    
    
    
    public static int sort(int[] array) {
    	int numberOfSwaps = 0;
    	for (int i = 0; i < array.length; i++) {
    		for (int j = 0; j < array.length - 1; j++) {
    			if (array[j] > array[j + 1]) {
    				int temp = array[j];
    				array[j] = array[j + 1];
    				array[j + 1] = temp;
    				numberOfSwaps++;
    			}
    		}
    		if (numberOfSwaps == 0) {
    			break;
    		}
    	}
    	return numberOfSwaps;
    }
    
}