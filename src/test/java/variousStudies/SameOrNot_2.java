package variousStudies;

import java.util.Scanner;

public class SameOrNot_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two word: ");
		String word1 = scan.next();
		String word2 = scan.next();
		int L1 = word1.length();
		int L2 = word2.length();

		boolean result = (word1.substring(0, 2).equals(word2.substring(L2 - 2, L2)));
		System.out.println(word1.substring(0, 2));
		System.out.println(word2.substring(L2 - 2, L2));
		System.out.println(result);
	}

}
