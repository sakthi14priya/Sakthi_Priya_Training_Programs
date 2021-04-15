package ola;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password,MobileNo;
		System.out.println("             Login Page    ");
		Scanner input = new Scanner(System.in);
		System.out.println("MobileNo:");
		MobileNo = input.nextLine();
		if(MobileNo.length()==10) {
			System.out.println("The Mobile no is valid");
		}
		System.out.println("Enter the Password:");
		password=input.nextLine();
		if (password.length()==8)
		{
		System.out.println("This Login page is Suceesfully Submitted...");	
		carTypes.car(); 
		}
		else
		{
			System.out.println("The password is invalid");
		}

	}
}
