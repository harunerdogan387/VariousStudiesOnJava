package variousStudies;

public class GasReceipt {
	public static void main(String[] args) {

		String store = "MCLEAN STORE";

		int y = 2019, m = 06, d = 19;

		int h = 04, min = 38;
		String aorp = "PM";

		double price = 2.089;
		double gallon = 10.870;

		double total = price * gallon;

		System.out.println("\n\n\t" + store);
		System.out.println();
		System.out.println(y + "-" + m + "-" + d + "\t" + h + ":" + min + aorp);
		System.out.println();
		System.out.println("Price/gallon: $" + " " + price);
		System.out.println("Gallons     : $" + " " + gallon);
		System.out.println();
		System.out.println("Fuel total  : $" + " " + total);

	}

}
