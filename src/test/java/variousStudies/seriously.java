package variousStudies;

import java.util.Scanner;

public class seriously {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a word: ");
	String word = sc.next();
	
	int L = word.length();
	
	if (word.substring(L-2,L).contentEquals("ly")) {
		System.out.println("never mind");
	}
	
	
}
}
