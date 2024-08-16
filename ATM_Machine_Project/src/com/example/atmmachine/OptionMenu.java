package com.example.atmmachine;

import java.util.Scanner;

public class OptionMenu 
{
    Scanner sc = new Scanner(System.in);
    public void withdraw(Account account)
    {
        System.out.println("Enter the withdraw amount : ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Withdrawn successfully : " + amount);
    }

    public void checkBankBalance(Account account)
    {
        System.out.println("Current Bank balance "+ account.getBalance());
    }

    public void deposit(Account account)
    {
        System.out.println("Enter the deposit amount : ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Deposited successfully : "+ amount);
    }

    public void transferMoney(Account account)
    {
        System.out.println("Enter the transfer amount : ");
        double amount = sc.nextDouble();
        account.transferMoney(amount);
        System.out.println("Transferred successfully : " + amount);
    }

    public void performOptions(Account account)
    {
        System.out.println("===== AVAILABLE OPTIONS ARE =====");
        System.out.println("1. WITHDRAW ");
        System.out.println("2. CHECK BANK BALANCE ");
        System.out.println("3. DEPOSIT MONEY ");
        System.out.println("4. TRANSFER MONEY ");
        System.out.println("5. EXIT ");
        System.out.println("PLEASE SELECT THE ABOVE OPTIONS");

	    int choice = sc.nextInt();
	    switch(choice)
	    {
	        case 1:
	        {
	            withdraw(account);
	            break;
	        }
	        case 2:
	        {
	            checkBankBalance(account);
	            break;
	        }
	        case 3:
	        {
	            deposit(account);
	            break;
	        }
	        case 4:
	        {
	            transferMoney(account);
	            break;
	        }
	        case 5:
	        {
	        	System.out.println("Existing...");
	        	System.exit(choice);
	        }
	        default:
	        System.out.println("Invalid option");
	    }
    }
}
