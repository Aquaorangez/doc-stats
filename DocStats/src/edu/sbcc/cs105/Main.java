/**
 * @author Mick Campitelli
 */

package edu.sbcc.cs105;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Prompts for filename, creates DocStats object with the filename, and 
 * prints out the number of characters, numbers, and lines in the file.
 * 
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		String input;
		
		System.out.print("Enter filename: ");
		input = s.nextLine();
		
		
		DocStats ds = new DocStats(input);
		
		System.out.println("Number of characters: " + ds.getNumberOfCharacters());
		System.out.println("Number of words: " + ds.getNumberOfWords());
		System.out.println("Number of lines: " + ds.getNumberOfLines());
		
		
		s.close();
	}

}
