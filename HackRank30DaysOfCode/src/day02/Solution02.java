/**
 * 
 */
package day02;

/**
 * @author BertBaldoni
 * @version 1.0 Feb 27, 2017
 * @project Solution.java Feb 27, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
import java.util.*;
import java.math.*;

public class Solution02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = ((double)tipPercent / 100) * mealCost;
        double tax = ((double)taxPercent / 100) * mealCost;
        double total = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}