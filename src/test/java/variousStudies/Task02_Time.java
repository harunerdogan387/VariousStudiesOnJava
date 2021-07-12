package variousStudies;

import java.util.Scanner;

public class Task02_Time {
	public static void main(String[] args) {

		// 15:53:37 ==> 3:53:37 PM
		Scanner scan = new Scanner(System.in);
		int h1, m1, s1;
		System.out.println("Enter a hours:");
		h1 = scan.nextInt();
		System.out.println("Enter a minute:");
		m1 = scan.nextInt();
		System.out.println("Enter a second:");
		s1 = scan.nextInt();
		// int h1 = 15, m1 = 53, s1 = 37;

		if (h1 > 24 || h1 < 0 || m1 > 60 || s1 > 60) {
			System.out.println("wrong input");
		} else if (h1 == 0 || h1 == 24) {
			h1 = h1 % 24;
			System.out.println(h1 + ":" + m1 + ":" + s1 + " AM");
		} else if (h1 >= 12 && h1 < 24) {
			h1 -= 12;
			System.out.println(h1 + ":" + m1 + ":" + s1 + " PM");
		} else {
			System.out.println(h1 + ":" + m1 + ":" + s1 + " AM");
		}

	}
}
