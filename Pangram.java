package com.assignment.java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	
	  public static boolean isPangram(String input) { 
	        input = input.toLowerCase();
	        Set<Character> uniLetters = new HashSet<>();
	        char arr[] =input.toCharArray();
	        for (char c : arr) {
	            if (Character.isLetter(c)) {
	                uniLetters.add(c);
	            }
	        } 
	        return uniLetters.size() == 26;
	    }
	  
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check weather it is pangram or not: ");
        String input = scanner.nextLine();
        
        boolean check=isPangram(input);
        if (check) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

    }
    
  
}
