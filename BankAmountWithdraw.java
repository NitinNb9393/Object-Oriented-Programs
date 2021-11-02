package com.bridgelabz.ooprogram;

import java.util.Scanner;

public class BankAmountWithdraw {
	static int account_No;
	static String name;
	static float amount;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		System.out.println("Enter Your Account Number : ");
		int account_No = sc.nextInt();
		System.out.println("Enter amount you want to Deposit : ");

		float Deposit_amount = sc.nextFloat();

		int flag = 0;
		while (flag == 0) {
			System.out.println("Enter your Choice : 1. Repeat 2.Display details 3.Exit");
			int option = sc.nextInt();
			if (option == 2) {
				displayDetails(name, account_No, amount);
			}
			if (option == 3) {
				flag = 1;
			}
		}
	}

	public static float depositOrWithdrow(String name, int account_No, float amount) {
		System.out.println("Enter your Option : \n 1. Deposit 2.Withdraw ");
		int option = sc.nextInt();
		if (option == 1) {
			amount = deposit(amount);
		} else if (option == 2) {
			amount = withdraw(amount);
		}
		return amount;
	}

	public static void displayDetails(String name, int account_No, float amount) {
		System.out.println("Account Holder Name : " + name + "\n Account number : " + account_No);
		System.out.println("Your Balance is : " + amount);
	}

	public static float deposit(float amount) {
		System.out.println("Enter amount you want to deposit : ");
		float depositAmt = sc.nextFloat();
		amount += depositAmt;
		return amount;
	}

	public static float withdraw(float amount) {
		System.out.println("Enter amount you want to withdraw : ");
		float withdrawAmt = sc.nextFloat();
		if (withdrawAmt <= amount)
			amount -= withdrawAmt;
		else
			System.out.println("You have Insufficient Balance in your account !");
		return amount;
	}
}