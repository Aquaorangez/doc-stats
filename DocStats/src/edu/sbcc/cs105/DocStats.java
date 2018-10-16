/**
 * @author Mick Campitelli
 */

package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Constructor takes a the name of a file, opens it, and calculates the number of
 * characters, words, and lines.
 * 
 */
public class DocStats {
	File stats;

	public DocStats(String documentName) {
		this.stats = new File(documentName);

	}

	/**
	 * Gets number of characters in the file
	 * 
	 * @return int # of characters
	 * @throws FileNotFoundException
	 */
	public int getNumberOfCharacters() throws FileNotFoundException {
		Scanner s = new Scanner(this.stats);

		int chars = 0;
		s.useDelimiter("");
		while (s.hasNextLine()) {
			s.next();
			chars++;
		}
		s.close();
		return chars;

	}

	/**
	 * Gets number of words in the file
	 * 
	 * @return int # of words
	 * @throws FileNotFoundException
	 */
	public int getNumberOfWords() throws FileNotFoundException {
		Scanner s = new Scanner(this.stats);

		int words = 0;
		while (s.hasNext()) {
			s.next();
			words++;
		}
		s.close();
		return words;

	}

	/**
	 * Gets number of lines in the file
	 * 
	 * @return int # of lines
	 * @throws FileNotFoundException
	 */
	public int getNumberOfLines() throws FileNotFoundException {
		Scanner s = new Scanner(this.stats);

		int lines = 0;
		s.useDelimiter("\n");
		while (s.hasNext()) {
			s.next();
			lines++;
		}
		s.close();
		return lines;

	}
}
