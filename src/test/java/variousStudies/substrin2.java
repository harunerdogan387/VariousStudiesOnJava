package variousStudies;

import java.util.Scanner;

public class substrin2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word: ");
	String word = scan.next();
	int Length = word.length();
    
    if (word.startsWith("x") || word.startsWith("X")) {
        word = word.substring(1);
   }
    Length = word.length();
    if (word.startsWith("x") || word.startsWith("X")) {
        word = word.substring(1);
        Length = word.length();
        System.out.println(word);
    }
    if (word.charAt(1)=='x'|| word.charAt(1)=='X'){
    	word = word.substring(0, 1) + word.substring(2);
    	System.out.println(word);
    }
   else {
       System.out.println(word);
   }	
		
}
}
