package variousStudies;

import java.util.Scanner;

/*
Frequency of characters
Due No Due Date  Points None
Write a program that can find the frequency of characters in String

ex:
str ="AAABBCDDDDEE";

output:  A3B2C1D4E2

*/
public class FrequensyCharecters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		int L = word.length();
		int i, count;
		char ch, chsmbl;

		System.out.println("Charecter \tFrequency");
		System.out.println("======================");
		
		for (chsmbl = 'A'; chsmbl <= 'z'; chsmbl++) {

			count = 0;
			for (i = 0; i < L; i++) {
				ch = word.charAt(i);
				if (chsmbl == ch) {
					count++;
				}

			}
			if (count != 0) {
				System.out.println("\t"+chsmbl + " \t\t " + count);
			}
		}

	}

}
