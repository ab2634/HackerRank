/**
 * 
 */
package problem01;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 18, 2017
 * @project Solutioin.java Mar 18, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) 
        	sum += scan.nextInt();
        
        System.out.println(sum);
        
    }
}