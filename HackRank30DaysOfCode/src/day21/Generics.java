/**
 * 
 */
package day21;

/**
 * @author BertBaldoni
 * @version 1.0 Mar 19, 2017
 * @project Generics.java Mar 19, 2017
 * Copyright (c) BertBaldoni 2017 All Rights Reserved
 *
 */
import java.util.*;

class Printer <T> {
	public void printArray(T[] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i]);
	}
}

public class Generics {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}