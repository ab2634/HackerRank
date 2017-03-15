/**
 * 
 */
package day08;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 9, 2017
 * @project Solution08.java Mar 9, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.util.*;
import java.io.*;

class Solution08 {
	
    public static void main(String []argh) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        int n = scan.nextInt();
       
        
        for(int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
            
        }
        while(scan.hasNext()){
            String s = scan.next();
           	if (phoneBook.containsKey(s))
           		System.out.println(s + "=" + phoneBook.get(s));
           	else
           		System.out.println("Not found");
        }
        scan.close();
    }
}
