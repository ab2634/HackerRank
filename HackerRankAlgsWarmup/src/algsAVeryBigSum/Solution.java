/**
 * 
 */
package algsAVeryBigSum;

/**
 * @author BertBaldoni
 * @version 1.0 May 22, 2017
 * @project Solution.java May 22, 2017
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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long endValue = 0;
        for (int i = 0; i < arr.length; i++) {
            endValue += arr[i];
        }
        System.out.print(endValue);
    }
}
