package ola;

public class Price {

	public static void bill() {
		int noOfkms = 10;
		int pricePerKm = 10;
		int bill = noOfkms * pricePerKm;
		System.out.println("Total Bill is: " + bill);
		Gst.amount(bill);
	}
}