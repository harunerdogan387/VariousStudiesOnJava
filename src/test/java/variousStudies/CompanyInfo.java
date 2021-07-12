package variousStudies;

public class CompanyInfo {

	/*
	 * company name address number of employees revenue is tech company
	 */
	public static void main(String[] args) {

		String name = "IBM (International Business Machines Corporation)";
		String address = "1 N Castle Dr, Armonk, NY 10504 ";
		long employees = 350600;
		long revenue = 79591;
		long net = 8723;
		String tech = "Yes, it is tech company.";

		System.out.println();
		System.out.println("Company Name             :" + " " + name);
		System.out.println("\nCompany address        :" + " " + address);
		System.out.println("\nNumber of employees    :" + " " + employees);
		System.out.println("\nAnnual revenue is      :" + " " + "$ " + revenue + " million");
		System.out.println("\nNet income is          :" + " " + "$ " + net + " million");
		System.out.println("\nIs it tech company?    :" + " " + tech);

	}

}
