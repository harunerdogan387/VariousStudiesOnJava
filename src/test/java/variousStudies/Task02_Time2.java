package variousStudies;

import java.util.Scanner;

public class Task02_Time2 {

	public static void main(String[] args) {

		// 15:53:37 ==> 3:53:37 PM

		Scanner scan = new Scanner(System.in);
		int h, m, s;
		int num = 0;
		System.out.println("Enter a hours:");
		h = scan.nextInt();
		System.out.println("Enter a minute:");
		m = scan.nextInt();
		System.out.println("Enter a second:");
		s = scan.nextInt();

		if (h > 24 || h < 0 || m > 60 || m < 0 || s > 60 || s < 0)
		// {System.out.println("wrong input");}
		{
			num = 1;
		}

		if (h >= 12 && h <= 24 || h == 0)
		// {h=h%12;System.out.println(h+":"+m+":"+s+" PM");}
		{
			num = 2;
		}
		// else {System.out.println(h+":"+m+":"+s+" AM");}

		switch (num) {
		case 1:
			System.out.println("wrong input");
			break;
		case 2:
			h = h % 12;
			System.out.println(h + ":" + m + ":" + s + " PM");
			break;
		default:
			System.out.println(h + ":" + m + ":" + s + " AM");
			break;
		}

	}
}
