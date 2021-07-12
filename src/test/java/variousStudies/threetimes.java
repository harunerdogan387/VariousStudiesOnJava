package variousStudies;

import java.util.Scanner;

public class threetimes {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word: ");
	String word = scan.next();
	
	word = word.substring(0,2);
	String word1 = "";

	
	
//	System.out.println(word+word+word); //1.
	
	
//	for (int i=1; i<=3; i++) {			//2.
//		word1+=word;
//	}
	
	
	
//	int i=1;							//3.
//	while(i<=3) {
//		word1+=word;
//		i++;
//	}
	
	
	int i=1;							//4.
	do {
		word1+=word;
		i++;
	}while (i<=3);
	
		
	System.out.println(word1);
}
}
