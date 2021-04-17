package tickets;
import java.util.Scanner;
public class Amount {
	public static void bill()
	{
		int seats,total,price;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Price: ");
		price = input.nextInt();
		System.out.println("Enter the no of seats: ");
		seats = input.nextInt();
		total = price * seats;
		System.out.println("The Total Bill is:  "+total);
		Percentage.gst(total);	
		}
}
