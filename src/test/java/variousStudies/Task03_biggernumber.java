package variousStudies;

public class Task03_biggernumber {

	public static void main(String[] args) {

		int n1 = 5, n2 = 9, n3 = 11;

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 = " + n1 + " and " + n1 + " is bigger");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 = " + n2 + " and " + n2 + " is bigger");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("n3 = " + n3 + " and " + n3 + " is bigger");
		} else if (n1 == n2 && n1 > n3) {
			System.out.println("n1 = n2 = " + n1 + " and " + n1 + " are bigger");
		} else if (n1 == n3 && n1 > n2) {
			System.out.println("n1 = n3 = " + n1 + " and " + n1 + " are bigger");
		} else if (n2 == n3 && n2 > n3) {
			System.out.println("n2 = n3 = " + n2 + " and " + n2 + " are bigger");
		} else {
			System.out.println("n1 = n2 = n3 = " + n1);
		}
	}
}
