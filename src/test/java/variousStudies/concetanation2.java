package variousStudies;

import java.util.Scanner;

public class concetanation2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two word: ");
		String word1 = input.next();
		String word2 = input.next();
		int L1 = word1.length();
		int L2 = word2.length();
		if (word1.charAt(L1-1)==word2.charAt(0)) {
			word1 = word1.concat(word2.substring(1));
		}
		else {
			word1 = word1.concat(word2);
		}
		System.out.println(word1);
}
}