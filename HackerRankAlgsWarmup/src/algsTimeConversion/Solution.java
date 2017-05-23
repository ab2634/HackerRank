/**
 * 
 */
package algsTimeConversion;

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
    	Scanner scan = new Scanner(System.in);
    	String inputStr = scan.nextLine();
    	char[] inputChar = inputStr.toCharArray();
    	
    	int hour = 0;
    	hour += ((inputChar[0] - 48) * 10);
    	hour += inputChar[1] - 48;
    	int minute = 0;
    	minute += ((inputChar[3] - 48) * 10);
    	minute += inputChar[4] - 48;
    	int second = 0;
    	second += ((inputChar[6] - 48) * 10);
    	second += inputChar[7] - 48;
    	
    	if (inputChar[8] == 'P' && hour != 12) 
    		hour += 12;
    	if (inputChar[8] == 'A' && hour == 12)
    		hour -= 12;
    	
    	String output = "";
    	if (hour < 10)
    		output += "0";
    	output += hour + ":";
    	if (minute < 10)
    		output += "0";
    	output += minute + ":";
    	if (second < 10)
    		output += "0";
    	output += second;
    	System.out.println(output);
    }
}