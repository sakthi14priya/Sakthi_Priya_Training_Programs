package tickets;
import java.util.Scanner;
public class TicketType {

	public static void type()
	{
		int amount;
		Scanner input = new Scanner(System.in);
	    System.out.println("Select any one:\n            1.First Class \n            2.Second Class \n            3.Third Class");
	    String ticket = input.nextLine();
	    if(ticket.equalsIgnoreCase("First Class") || ticket.equalsIgnoreCase("Second Class") || ticket.equalsIgnoreCase("Third Class"))
	    {
	    	System.out.println("This Class is Available...");
	    	Amount.bill();
	    }
	    else{
	    	System.out.println("This class is not Available");
	    	
	    }
	}
	

}
