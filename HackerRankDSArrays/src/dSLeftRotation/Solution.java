/**
 * 
 */
package dSLeftRotation;

import java.io.*;
import java.util.*;

/**
 * @author BertBaldoni
 * @version 1.0 Feb 22, 2017
 * @project Solution.java Feb 22, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
public class Solution {

	public static class Buffer {
		int[] array;
		int count;
		
		public Buffer(int size) {
			array = new int[size];
			count = 0;
		}
		
		public void add(int value) {
			array[count] = value;
			count++;
		}
		
		public void leftRotate() {
			int firstValue = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = firstValue;
		}
		
		public void print() {
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		Buffer buf = new Buffer(n);
		
		for (int i = 0; i < n; i++) 
			buf.add(scanner.nextInt());
	
		for (int i = 0; i < d; i++)
			buf.leftRotate();
		
		buf.print();
	
	}

}