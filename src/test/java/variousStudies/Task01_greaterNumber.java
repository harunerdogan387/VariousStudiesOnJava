package variousStudies;

public class Task01_greaterNumber {

	public static void main(String[] args) {

		int num1 = 55, num2 = 66, num3 = 77;
		int maxNum = 0;

		if (num1 > num2 && num1 > num3) {
			maxNum = num1;
			int less12 = num1 - num2;
			int less13 = num1 - num3;

			System.out.println("Maximum Number is " + maxNum);
			System.out.println(num1 + " is " + less12 + " greater than " + num2);
			System.out.println(num1 + " is " + less13 + " greater than " + num3);
		} else if (num2 > num1 && num2 > num3) {
			maxNum = num2;
			int less21 = num2 - num1;
			int less23 = num2 - num3;

			System.out.println("Maximum Number is " + maxNum);
			System.out.println(num2 + " is " + less21 + " greater than " + num1);
			System.out.println(num2 + " is " + less23 + " greater than " + num3);
		} else {
			maxNum = num3;
			int less31 = num3 - num1;
			int less32 = num3 - num2;

			System.out.println("Maximum Number is " + maxNum);
			System.out.println(num3 + " is " + less31 + " greater than " + num1);
			System.out.println(num3 + " is " + less32 + " greater than " + num2);
		}

	}

}
