package com.example.atmmachine;

import java.util.Scanner;

public class ATM 
{ 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        OptionMenu opt = new OptionMenu();
        
        System.out.print("Enter the pin : ");
        int pin = sc.nextInt();
        account.setPinNo(pin);
        if(account.validatePin()) 
        {
        	opt.performOptions(account);	
        }
        else
        {
        	System.out.println("Invalid pin");
        	System.out.println("Please try again");	
        }
        sc.close();
    }
}

