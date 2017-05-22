/**
 * 
 */
package algsMiniMaxSum;

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
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long temp = arr[1] + arr[2] + arr[3] + arr[4];
        long min = Long.MAX_VALUE;
        long max = 0;
        if (temp <= min)
        	min = temp;
        if (temp >= max)
        	max = temp;
        
        temp = arr[0] + arr[2] + arr[3] + arr[4];
        if (temp <= min)
        	min = temp;
        if (temp >= max)
        	max = temp;
        
        temp = arr[0] + arr[1] + arr[3] + arr[4];
        if (temp <= min)
        	min = temp;
        if (temp >= max)
        	max = temp;
        
        temp = arr[0] + arr[1] + arr[2] + arr[4];
        if (temp <= min)
        	min = temp;
        if (temp >= max)
        	max = temp;
        
        temp = arr[0] + arr[1] + arr[2] + arr[3];
        if (temp <= min)
        	min = temp;
        if (temp >= max)
        	max = temp;
        
        System.out.println(min + " " + max);
    }
}