/**
 * 
 */
package algsDiagonalDifference;

/**
 * @author BertBaldoni
 * @version 1.0 May 22, 2017
 * @project Solution.java May 22, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int[][] matrix = new int[n][n];
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			matrix[i][j] = input.nextInt();
    		}
    	}
    	
    	int primaryDiagonal = 0;
    	int secondaryDiagonal = 0;
    	
    	for (int i = 0; i < n; i++) {
    		primaryDiagonal += matrix[i][i];
    		secondaryDiagonal += matrix[i][n - i - 1];
    	}
    	int answer = Math.abs(primaryDiagonal - secondaryDiagonal);
    	
    	System.out.println(answer);
    }
}
