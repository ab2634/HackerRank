/**
 * 
 */
package day18;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 15, 2017
 * @project Solution.java Mar 15, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */

import java.io.*;
import java.util.*;

public class Solution {
	
	char[] stack = new char[1000];
	int stackPointer = 0;
	char[] queue = new char[1000];
	int queueTail = 0;
	int queueFront = 0;
	
	public void pushCharacter(char c) {
		stack[stackPointer] = c;
		stackPointer++;
	}
	
	public void enqueueCharacter(char c) {
		queue[queueTail] = c;
		queueTail++;
	}
	
	public char popCharacter() {
		stackPointer--;
		return stack[stackPointer];
	}
	
	public char dequeueCharacter() {
		return queue[queueFront++];
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
