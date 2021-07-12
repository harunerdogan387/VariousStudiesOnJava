package variousStudies;

import java.util.Scanner;

public class substring1 {
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word: ");
	String word = scan.next();
	
    
    if (word.startsWith("x") || word.startsWith("X")) {
        word = word.substring(1);
        System.out.println(word);
    }
    else {
    	System.out.println(word);
    }
    
}
}
