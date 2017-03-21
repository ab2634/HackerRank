/**
 * 
 */
package problem04;

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
    	
    	for (int i = 0; i < n; i++) {
    		int px = scan.nextInt();
    		int py = scan.nextInt();
    		Point p = new Point(px, py);
    		int qx = scan.nextInt();
    		int qy = scan.nextInt();
    		Point q = new Point(qx, qy);
    		
    		int newX = (q.x - p.x) + q.x;
    		int newY = (q.y - p.y) + q.y;
    		
    		System.out.println(newX + " " + newY);	
    	}
    	
    }
    
    
    
    
    static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}