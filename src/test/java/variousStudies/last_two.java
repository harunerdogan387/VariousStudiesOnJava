package variousStudies;

import java.util.Scanner;

public class last_two {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a word");
	String word = scan.next();
	int L = word.length();
	System.out.println(word);
	
	word = word.substring(0, L-2)+word.charAt(L-1)+word.charAt(L-2);
	System.out.println(word);
}
}
