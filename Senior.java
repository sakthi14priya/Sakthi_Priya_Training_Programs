package ola;
import java.util.Scanner;
public class Senior {
	public static void citizen()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Age: ");
			int age=sc.nextInt();
			if(age < 60 )
			{
				System.out.println("The Person is Junior...");
			}
			else if(age > 60)
			{
				System.out.println("The Person is Senior Citizen...So 50% Discount in Bill...");
			}
		}
				
	}

}
