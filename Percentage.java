package tickets;

public class Percentage {
	public static void gst(int total) {
		float gst = (total * 7) / 100;
		float gstbill = gst + total;
		System.out.println("The Gst is : " + gst);
		System.out.println("The Gstbill is :" + gstbill);
		DateTime.date();
	}

}
