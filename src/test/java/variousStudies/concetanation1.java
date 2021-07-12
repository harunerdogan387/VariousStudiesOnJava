package variousStudies;

import java.util.Scanner;

public class concetanation1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two word: ");
	String word1 = input.next();
	String word2 = input.next();
	word1 = word1.concat(word2);
	System.out.println(word1);
	
}
}
