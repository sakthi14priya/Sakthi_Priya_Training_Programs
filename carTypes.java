package ola;
import java.util.Scanner;
public class carTypes {

	public static void car() {
		// TODO Auto-generated method stub
		String Mini,Micro,Prime;
		Scanner input = new Scanner(System.in);
		System.out.println("Select the Car: 1.Mini,2.Micro,3.Prime:");
	    String cabName= input.nextLine();
	    if(cabName.equalsIgnoreCase("Mini") || cabName.equalsIgnoreCase("Micro") || cabName.equalsIgnoreCase("Prime"))
	    {
	    System.out.println("This car is Avaliable");
	    Price.bill();
	    }
	    else
	    {
	    	System.out.println("This is not Available");
	    }
	    
	    

	}

}
