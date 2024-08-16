package com.example.atmmachine;

public class Account 
{
    private int pinNumber;
    private double balance;
    private final int correctPin = 1212;
    public void setPinNo(int pinNo)
    {
         this.pinNumber = pinNo;
    }
    public int getpinNo()
    {
        return pinNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean validatePin()
    {
    	return this.pinNumber == correctPin;
    }
    public double withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
        }
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
        else
        {
            System.out.println("Invalid amount ");
        }
    }
    public void transferMoney(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
        }
        else 
        {
            System.out.println("Invalid amount or Insufficent balance");
        }
    }
}