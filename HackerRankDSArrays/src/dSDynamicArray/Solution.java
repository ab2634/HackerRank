/**
 * 
 */
package dSDynamicArray;

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
		
		// website said to make each sequence of length N-1, but 
		// that would crash the program when N is very large?
		public Buffer() {
			count = 0;
			array = new int[50];
		}
		
		public void add(int value) {
			array[count] = value;
			count++;
		}
		
		public int getValueAtIndex(int index) {
			return array[index];
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		int lastAns = 0;
		
		ArrayList<Buffer> list = new ArrayList<Buffer>(N);
		
		for (int i = 0; i < N; i++) {
			list.add(i, new Buffer());
		}
		
		
		for (int i = 0; i < Q; i++) {
			
			if (scanner.nextInt() == 1) { 
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int seq = ((x ^ lastAns) % N);
				list.get(seq).add(y);;
			}
			else {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				int seq = ((x ^ lastAns) % N);
				int index = (y % list.get(seq).count);
				lastAns = list.get(seq).getValueAtIndex(index);
				System.out.println(lastAns);
				
			}
		}
	}
}
