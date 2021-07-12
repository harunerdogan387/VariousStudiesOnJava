package variousStudies;

import java.util.*;

public class Task05_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Enter a number:");
		a = scan.nextInt();

		if (a == 0) {
			System.out.println("Zero");
		} else if (a > 0) {
			System.out.println("Pozitif");
		} else if (a < 0) {
			System.out.println("Negatif");
		} else {
			System.out.println("invalid");
		}
	}
}
