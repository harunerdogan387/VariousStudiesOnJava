package variousStudies;

public class Cities_Together {
	public static void main(String[] args) {

		String city1 = "Tashkent";
		String city2 = "Kyiv";
		String city3 = "Moscow";

		String trvl1 = "From Tashkent to Kyiv was $";
		String trvl2 = "from Kyiv to Tashkent was $";
		String trvl3 = "From Moscow to Kyiv was $";
		String trvl4 = "from Kyiv to Moscow was $";

		int price1 = 500, price2 = 550;
		System.out.println("I am living Tashkent.");
		System.out.print("\nI went to first Kyiv and then Moscow last summer.");

		System.out.println();
		System.out.println(trvl1 + price1 + " and " + trvl4 + price2 + " then,");
		System.out.println(trvl3 + price2 + " and " + trvl2 + price1 + ".");

		System.out.println("\nMy flight costs $" + (2 * (price1 + price2)) + ".");

	}

}
