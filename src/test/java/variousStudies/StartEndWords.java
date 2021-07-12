package variousStudies;

import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two word: ");
		String word1 = scan.next();
		String word2 = scan.next();
		int L1 = word1.length();
		int L2 = word2.length();

		if (L1 != 5 || L2 != 5) {
			System.out.println("need to be exactly 5 chars length");
		}

		else if (word1.substring(L1 - 2, L1).equals(word2.substring(0, 2))) {
			System.out.println("Fizz");
		} else {
			System.out.println("Buzz - did not match");

		}
	}
}
