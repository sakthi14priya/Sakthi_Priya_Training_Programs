package ola;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Booking {

	public static void date()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date: ");
		String Date = sc.next();
		LocalDate currentDate = LocalDate.now();
		LocalDate Ob = LocalDate.parse(Date);
		if(Ob.isAfter(currentDate))
		{
			System.out.println("the date is valid...");
		}
		else if(Ob.isBefore(currentDate))
		{
			System.out.println("The Date is InValid...");
		}
		else if(Ob == currentDate)
		{
			System.out.println("The Date is Valid...");
		}
		System.out.println("Enter Time:");
		String Time=sc.next();
		LocalTime currentTime  = LocalTime.now();
		LocalTime a = LocalTime.parse(Time);
		if(a.isAfter(currentTime))
		{
			System.out.println("The time is Valid...");   
		    Peak.hours();
		}
		else if(a.isBefore(currentTime))
		{
			System.out.println("The time is Invalid...");
		}

	}

}
