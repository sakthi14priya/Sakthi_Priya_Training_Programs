package tickets;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password, MobileNo;
		System.out.println("           LOGIN PAGE     ");
		Scanner input = new Scanner(System.in);
		System.out.println("MobileNo:");
		MobileNo = input.nextLine();
		if (MobileNo.length() == 10) {
			System.out.println("The Mobile No is Valid");
		} else {
			System.out.println("The Mobile No is Invalid");
			main(args);
		}
		System.out.println("Enter the Password:");
		password = input.nextLine();
		if (password.length() == 8) {
			System.out.println("This Login page is Suceesfully Submitted...");
			TicketType.type();
		} else {
			System.out.println("The password is invalid");
		}

	}
}
