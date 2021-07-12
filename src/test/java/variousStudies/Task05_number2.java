package variousStudies;

import java.util.*;

public class Task05_number2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a;
		int num = 0;
		System.out.println("Enter a number:");
		a = scan.nextInt();

		if (a == 0) {
			num = 1;
		} else if (a > 0) {
			num = 2;
		} else {
			num = 3;
		}

		switch (num) {

		case 1:
			System.out.println("Zero");
			break;
		case 2:
			System.out.println("Pozitive");
			break;
		case 3:
			System.out.println("Negative");
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}
}
