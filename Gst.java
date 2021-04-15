package ola;

public class Gst {
	
	public static void amount(int bill) {
		float gst=(bill*7)/100;
		float gstbill=gst+bill;
		System.out.println("The Gst is : "+gst);
		System.out.println("The Gstbill is :"+gstbill);
		Booking.date();
	}

}
