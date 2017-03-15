/**
 * 
 */
package day11;

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
		
		Scanner scanner = new Scanner(System.in);
		int[][] A = new int[6][6];
		
		for (int i = 0; i < 6; i++)
			for(int j = 0; j < 6; j++) 
				A[i][j] = scanner.nextInt();
		
		/*
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) 
				System.out.print(A[i][j] + " ");
			System.out.println();
		}
		*/
		
		int sum = -2147483648;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int tempSum = 0;
				tempSum += A[i][j];
				tempSum += A[i][j + 1];
				tempSum += A[i][j + 2];
				tempSum += A[i + 1][j + 1];
				tempSum += A[i + 2][j];
				tempSum += A[i + 2][j + 1];
				tempSum += A[i + 2][j + 2];
				if (tempSum > sum)
					sum = tempSum;
			}
		}
		System.out.println(sum);
			
		
	}

}
