/**
 * 
 */
package problem06;

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
    	int n = scan.nextInt();
    	long k = scan.nextInt();
    	int count = 0;
    	PriorityQueue queue = new PriorityQueue();
    	
    	for (int i = 0; i < n; i++) {
    		int toAdd = scan.nextInt();
    		queue.add(toAdd);
    	}
    	
    	
    	while ((Integer)queue.peek() <= k) {
    		if (queue.size() == 1 && (Integer)queue.peek() < k || queue.size() == 1) {
    			count = -1;
    			break;
    		}
    		count++;
    		int x = (Integer)queue.remove();
    		int y = (Integer)queue.remove() * 2;
    		queue.add(x + y);
    	}
    		
    	System.out.println(count);
    } 
}