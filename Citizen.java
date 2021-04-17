package tickets;

import java.time.LocalDate;
import java.util.Scanner;

public class Citizen {
	public static void citizen()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Date of Birth:");
		String dobstr = input.next();
		LocalDate dobObject = LocalDate.parse(dobstr);
		System.out.println("DOB Object:" + dobObject);
		int age;
		System.out.println("Enter the Age:");
		age = input.nextInt();
		if(age >= 60)
		{
			System.out.println("The Person is senior Citizen...");
		}
		else if(age < 60)
		{
			System.out.println("The Person is Junior...");
		}
	}

}


