package Bank_Account_System;

import java.security.PrivateKey;

public class BankAccount {

    private String name;
    private int age;
    private double amount;
    private int accountNumber;

    public BankAccount(String name, int age, double amount, int accountNumber){
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getAmount() {
        return amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void displayAccount(){
        System.out.println(
                "Name : " + name +
                        "Age : " + age +
                        "Account no :" + accountNumber +
                        "Amount :" + amount
        );
    }
}
