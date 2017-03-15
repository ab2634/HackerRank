/**
 * 
 */
package day14;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 15, 2017
 * @project Difference.java Mar 15, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	
	private int[] elements;
  	public int maximumDifference;
  	int smallest;
  	int largest;
  	
  	public Difference(int[] elements) {
  		this.elements = elements;
	}
  	
	public void computeDifference() {
		smallest = elements[0];
		largest = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > largest)
				largest = elements[i];
			else if (elements[i] < smallest)
				smallest = elements[i];
		}
		maximumDifference = largest - smallest;
	}
	
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
