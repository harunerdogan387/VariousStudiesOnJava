package variousStudies;

public class Task04 {
	/*
	 * declare two variables: int a =10; int b= 15; swipe those two variables value
	 * without using a temporary variable Ex: System.out.println(a); ===> 15
	 * System.out.println(b); ===> 10
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		a = (a + b) - a;
		b = 2 * (a % 10);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
