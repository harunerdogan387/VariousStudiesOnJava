package variousStudies;

import java.util.Scanner;

public class makeThemEqual {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String word1 = sc.next();
	String word2 = sc.next();
	int L1 =word1.length();
	int L2 =word2.length();
	
	
	if (L1>L2) {
		word1=word1.substring(0, L2);	
		word1 = word1.concat(word2);
		System.out.println(word1);
	}
	else if (L1<L2) {
		word2=word2.substring(0, L1);	
		word2 = word2.concat(word1);
		System.out.println(word2);	
		
	}
	else {
		word1 = word1.concat(word2);
		System.out.println(word1);
	}
	
}
}
